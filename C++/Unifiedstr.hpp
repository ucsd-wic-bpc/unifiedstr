#include <string>
#include <sstream>
#include <iomanip>
#include <cstdarg>
#include <vector>
#include <iostream>

class Unifiedstr {
  public:
    template <typename T>
    static std::string to_string(T obj);

    template <typename T>
    static std::string deep_to_string(void* arr, int depth, ...);

  private:
    template <typename T>
    static std::string deep_to_string_stacked(void* arr, std::vector<int>& lengths, int curdepth=0);
};

template <typename T> std::string Unifiedstr::to_string(T obj) {
  std::ostringstream convert;
  convert << obj;
  return convert.str();
}

template <> std::string Unifiedstr::to_string(bool obj) {
  return obj ? "True" : "False";
}

template <> std::string Unifiedstr::to_string(double obj) {
  std::ostringstream convert;
  convert << std::setprecision(1) << std::fixed;
  convert << obj;
  return convert.str();
}

template <typename T>
std::string Unifiedstr::deep_to_string(void* arr, int depth, ...) {
  std::vector<int> lengths_vec;

  va_list lengths;
  va_start(lengths, depth);
  for (int i = 0; i < depth; i++) {
    lengths_vec.push_back(va_arg(lengths, int));
  }
  va_end(lengths);

  return Unifiedstr::deep_to_string_stacked<T>(arr, lengths_vec);
}

template <typename T>
std::string Unifiedstr::deep_to_string_stacked(void* arr, std::vector<int>& lengths, int curdepth) {
  if (lengths.size() == 0)
    return "";

  std::ostringstream write;
  write << "[";

  int length = lengths[curdepth];
  for (int i = 0; i < length; i++) {
    if (curdepth >= (lengths.size() - 1)) {
      write << Unifiedstr::to_string(((T*)arr)[i]);
    }
    else {
      int inner_length = lengths[curdepth+1];
      T* t_ptr = (T*) arr;
      T* inner_array = (t_ptr + (inner_length * i));
      write << Unifiedstr::deep_to_string_stacked<T>((void*)inner_array, lengths, curdepth+1);
    }

    if (i < (length - 1))
      write << ", ";
  }

  write << "]";

  return write.str();
}
