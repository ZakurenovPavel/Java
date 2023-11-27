package Task3;

public class Pair<T extends Comparable<T>> {

  private T left;
  private T right;

  public Pair(T left, T right) {
    this.left = left;
    this.right = right;
  }

  public T getLeft() {
    return left;
  }

  public void setLeft(T left) {
    this.left = left;
  }

  public T getRight() {
    return right;
  }

  public void setRight(T right) {
    this.right = right;
  }

  public T min() {
    if (left.compareTo(right) > 0) {
      return right;
    }
    return left;
  }

  public T max() {
    if (left.compareTo(right) > 0) {
      return left;
    }
    return right;
  }
}