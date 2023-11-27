package Task1;

public class Test1 {

  public static void main(String[] args) {
    MatrixBase<Integer> matrix = new Matrix<>(3, 3);
    int value = 0;
    for (int i = 1; i < 4; i++) {
      for (int j = 1; j < 4; j++) {
        value++;
        matrix.add(value, i, j);
      }
    }
    assert matrix.get(1, 1) == 1;
    assert matrix.get(1, 2) == 2;
    assert matrix.get(1, 3) == 3;
    assert matrix.get(2, 1) == 4;
    assert matrix.get(2, 2) == 5;
    assert matrix.get(2, 3) == 6;
    assert matrix.get(3, 1) == 7;
    assert matrix.get(3, 2) == 8;
    assert matrix.get(3, 3) == 9;
    matrix.remove(2, 2);
    assert matrix.get(2, 2) == null;
    matrix.remove(1, 3);
    assert matrix.get(1, 3) == null;
    matrix.remove(3, 1);
    assert matrix.get(3, 1) == null;
    System.out.println("OK");
  }
}
