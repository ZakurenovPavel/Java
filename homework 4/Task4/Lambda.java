package Task4;

public class Lambda {

  public static void main(String[] args) {
    lambda();
  }

  static void lambda() {
    MyInterface myInterface = (x) -> {
      if (x > 0) {
        System.out.println("Положительное число");
      } else if (x < 0) {
        System.out.println("Отрицательное число");
      } else {
        System.out.println("Ноль");
      }
    };
    myInterface.sign(1);
    myInterface.sign(-1);
    myInterface.sign(0);
  }

  @FunctionalInterface
  interface MyInterface {

    void sign(int x);
  }
}