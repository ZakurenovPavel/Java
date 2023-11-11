public class Task1 {

  public static void main(String[] args) {
    System.out.println(equals("Hello", "hello"));
    System.out.println(replace("Hello", "o", "a"));
    System.out.println(format("Zakurenov", 10, "java"));
    System.out.println(isPalindrome("QwewQ"));
  }

  //task 1
  static boolean equals(String s, String t) {
    return (s.equalsIgnoreCase(t));
  }


  static String replace(String str, String oldStr, String newStr) {
    return str.replace(oldStr, newStr);
  }

  static String format(String surname, int mark, String subject) {
    return "Cтудент " + surname + " получил " + mark + " по предмету " + subject;
  }

  static boolean isPalindrome(String str) {
    int len = str.length();
    if (len % 2 == 0) {
      for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - 1 - i)) {
          return false;
        }
      }
    }
    return true;
  }
}

