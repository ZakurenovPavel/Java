package Task3;

public class Test3 {

  public static void main(String[] args) {
    Pair<Integer> pair = new Pair<>(2, 4);
    assert pair.getLeft() == 2;
    assert pair.getRight() == 4;
    assert pair.min() == 2;
    assert pair.max() == 4;
    pair.setLeft(5);
    assert pair.min() == 4;
    assert pair.min() == 5;
    System.out.println("OK");
  }
}
