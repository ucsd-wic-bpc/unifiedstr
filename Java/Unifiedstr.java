import java.util.Arrays;

class Unifiedstr {

  public static String toString(boolean b) {
    return b ? "True" : "False";
  }

  public static String toString(boolean[] b) {
    String[] string_arr = new String[b.length];
    for (int i = 0; i < b.length; i++) {
      string_arr[i] = toString(b[i]);
    }
    
    return Arrays.toString(string_arr);
  }

  public static String toString(double d) {
    return String.valueOf(d);
  }

  public static String toString(double[] b) {
    String[] string_arr = new String[b.length];
    for (int i = 0; i < b.length; i++) {
      string_arr[i] = toString(b[i]);
    }
    
    return Arrays.toString(string_arr);
  }

  public static String toString(String s) {
    return s;
  }

  public static String toString(String[] b) {
    String[] string_arr = new String[b.length];
    for (int i = 0; i < b.length; i++) {
      string_arr[i] = toString(b[i]);
    }
    
    return Arrays.toString(string_arr);
  }

  public static String toString(char c) {
    return Character.toString(c);
  }

  public static String toString(char[] b) {
    String[] string_arr = new String[b.length];
    for (int i = 0; i < b.length; i++) {
      string_arr[i] = toString(b[i]);
    }
    
    return Arrays.toString(string_arr);
  }

  public static String toString(int i) {
    return Integer.toString(i);
  }

  public static String toString(int[] b) {
    String[] string_arr = new String[b.length];
    for (int i = 0; i < b.length; i++) {
      string_arr[i] = toString(b[i]);
    }
    
    return Arrays.toString(string_arr);
  }

  public static String deepToString(Object[] o) {
    StringBuilder buf = new StringBuilder();
    if (o == null) {
      return "null";
    }

    int index_max = o.length - 1;
    if (o.length == 0) {
      return "[]";
    }

    buf.append('[');

    for (int i = 0; i < o.length; i++) {
      Object element = o[i];
      if (element == null) {
        buf.append("null");
      } else {
        Class element_class = element.getClass();
        if (element_class == boolean.class)
          buf.append(toString((boolean) element));
        else if (element_class == double.class)
          buf.append(toString((double) element));
        else if (element_class == char.class)
          buf.append(toString((char) element));
        else if (element_class == int.class)
          buf.append(toString((int) element));
        else if (element_class == String.class)
          buf.append(toString((String) element));
        else if (element_class == boolean[].class)
          buf.append(toString((boolean[]) element));
        else if (element_class == double[].class)
          buf.append(toString((double[]) element));
        else if (element_class == char[].class)
          buf.append(toString((char[]) element));
        else if (element_class == int[].class)
          buf.append(toString((int[]) element));
        else if (element_class == String[].class)
          buf.append(toString((String[]) element));
      }

      if (i == index_max) 
        break;
      buf.append(", ");
    }
    buf.append(']');
    return buf.toString();
  }
}
