package Task8;

public class String {

  public static void main(String[] args) {
    try {
      String s = null;
      String m = s.toLowerCase();
    } catch (NullPointerException e) {
      System.out.println("Нельзя работать с пустой строкой");
    }
  }
}
