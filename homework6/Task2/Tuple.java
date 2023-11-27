package Task2;

public class Tuple<E> {

  private E[] el;
  private int size;

  public Tuple(int capacity) {
    if (capacity < 0) {
      throw new IllegalArgumentException("Вместимость кортежа не может быть отрицательной");
    }
    el = (E[]) new Object[capacity];
    size = 0;
  }

  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Выход за границы кортежа");
    }
    return el[index];
  }

  public void add(E value) {
    add(value, size);
  }

  public void add(E value, int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Выход за границы кортежа");
    }
    for (int i = size; i > index; i--) {
      el[i] = el[i - 1];
    }
    el[index] = value;
    size++;
  }

  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Выход за границы кортежа");
    }
    for (int i = index; i < size - 1; i++) {
      el[i] = el[i + 1];
    }
    el[size - 1] = null;
    size--;
  }

  public void remove(E value) {
    for (int i = 0; i < size; i++) {
      if (el[i] == value) {
        remove(i);
        return;
      }
    }
    throw new IllegalArgumentException("Элемента найдено не было");
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E orElse(int index, E value) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Выход за границы кортежа");
    }
    return el[index] == null ? (E) el[index] : value;
  }
}
