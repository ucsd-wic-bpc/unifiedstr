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
}
