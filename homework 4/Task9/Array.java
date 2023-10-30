package Task9;

public class Array {

  public static void main(String[] args) {
    try {
      int[] m = new int[2];
      m[8] = 5;
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Массив выходит за пределы своего размера!");
    }
  }

}
