package Task4;

public class Main2 {

  public static void main(String[] args) {
    Integer[] myArray = {7, 9, 2, 4, 8};
    NewPair<Integer> pair = minMax(myArray);
    assert pair.getLeft() == 2;
    assert pair.getRight() == 9;
    System.out.println("OK");
  }

  public static <T extends Comparable<T>> NewPair<T> minMax(T[] arr) {
    if (arr.length == 0) {
      throw new IllegalArgumentException("Массив пуст");
    }
    T min = arr[0];
    T max = arr[0];
    for (T t : arr) {
      if (t.compareTo(min) < 0) {
        min = t;
      }
      if (t.compareTo(max) > 0) {
        max = t;
      }
    }
    return new NewPair<>(min, max);
  }
}


class NewPair<T extends Comparable<T>> {

  private T left;
  private T right;

  public NewPair(T left, T right) {
    this.left = left;
    this.right = right;
  }

  public T getLeft() {
    return left;
  }

  public T getRight() {
    return right;
  }
}
