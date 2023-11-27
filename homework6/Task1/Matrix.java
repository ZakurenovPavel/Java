package Task1;

public class Matrix<T> implements MatrixBase<T> {

  public T[][] matrix;

  int line;

  int column;

  public Matrix(int line, int column) {
    this.matrix = (T[][]) new Object[line][column];
    this.line = line;
    this.column = column;
  }

  public Matrix(T[][] matrix) {
    this.line = matrix.length;
    this.column = matrix[0].length;
    this.matrix = matrix;
  }

  @Override
  public void add(T value, int line, int column) {
    int lines = matrix.length;
    int columns = matrix[0].length;
    if (line < 1 || column < 1 || line > lines || column > columns) {
      throw new IndexOutOfBoundsException("Выход за пределы матрицы");
    }
    matrix[line - 1][column - 1] = value;
  }

  @Override
  public void remove(int line, int column) {
    int lines = matrix.length;
    int columns = matrix[0].length;
    if (line < 1 || column < 1 || line > lines || column > columns) {
      throw new IndexOutOfBoundsException("Выход за пределы матрицы");
    }
    matrix[line - 1][column - 1] = null;
  }

  @Override
  public T get(int line, int column) {
    int lines = matrix.length;
    int columns = matrix[0].length;
    if (line < 1 || column < 1 || line > lines || column > columns) {
      throw new IndexOutOfBoundsException("Выход за пределы матрицы");
    }
    return matrix[line - 1][column - 1];
  }
}