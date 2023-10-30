package Task3;

public class Main {

  public static void main(String[] args) {
    lambda();
  }

  static void lambda() {
    Printable printable = () -> System.out.println("Ice flowers");
    printable.print();
  }
}


