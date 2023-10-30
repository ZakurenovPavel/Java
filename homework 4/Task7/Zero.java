package Task7;

public class Zero {

  public static void main(String[] args) {
    try {
      int a = 42 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Деление на ноль невозможно!");
    }
  }

}
