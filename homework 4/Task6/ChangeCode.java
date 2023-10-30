package Task6;

import java.io.IOException;

public class ChangeCode {

  public static void main(String[] args) throws IOException {
    try {
      int a = 1;
      int b = 1;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = {1, 2};
      abc[-1] = 9;
    } catch (ArithmeticException ex) {
      System.out.println("Деление на ноль невозможно!");
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }
  }

  public static void printSum(Integer a, Integer b) throws NullPointerException {
    System.out.println(a + b);
  }

}
