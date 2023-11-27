package Task1;

public interface MatrixBase<T> {

  void add(T value, int line, int column);

  void remove(int line, int column);

  T get(int line, int column);
}
