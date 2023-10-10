public class Task1 {

    public static void main(String[] args) {
        System.out.println(equals("Hello","hello"));
        System.out.println(replace("Hello","o","a"));
        System.out.println(format("Zakurenov", 10, "java"));
        System.out.println(isPalindrome("QwertyYTREWQ"));
    }

    //task 1
    static boolean equals(String s, String t) {
        if (s.equalsIgnoreCase(t)) {
            return true;
        } else {
            return false;
        }
    }

    static String replace (String str, String oldStr, String newStr) {
        str = str.replace(oldStr, newStr);
        return str;
    }

    static String format (String surname, int mark, String subject) {
        return "Cтудент " + surname + " получил " + mark + " по предмету " + subject;
    }

    static boolean isPalindrome(String str) {
        return str.replaceAll("\\W","").equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W","")).reverse().toString());
    }

}

