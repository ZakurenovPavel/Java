package main.java.hw_classes;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListUtil {

  public static List<Integer> rangeList(int from, int to) {
    return new AbstractList<>() {
      @Override
      public Integer get(int index) {
        if (index < from || index >= to) {
          throw new IndexOutOfBoundsException();
        }
        return from + index;
      }

      @Override
      public int size() {
        return to - from;
      }

      @Override
      public int indexOf(Object o) {
        for (int i = from; i < to; i++) {
          if (get(i).equals(o)) {
            return i;
          }
        }
        return -1;
      }

      @Override
      public int lastIndexOf(Object o) {
        for (int i = to - 1; i >= from; i--) {
          if (get(i).equals(o)) {
            return i;
          }
        }
        return -1;
      }

      @Override
      public boolean contains(Object o) {
        for (int i = from; i < to; i++) {
          if (get(i).equals(o)) {
            return true;
          }
        }
        return false;
      }
    };
  }

  public static List<Integer> medianSort(List<Integer> list) {
    List<Integer> sortedList = new ArrayList<>(list);
    if (!sortedList.isEmpty()) {
      Collections.sort(sortedList);
      int middle = sortedList.size() / 2;
      double median;
      if (sortedList.size() % 2 != 0) {
        median = sortedList.get(middle);
      } else {
        median = (sortedList.get(middle - 1) + sortedList.get(middle)) * 0.5;
      }
      double finalMedian = median;
      sortedList.sort(Comparator.comparingInt(n -> (int) Math.abs((int) n - finalMedian))
          .thenComparing(Comparator.comparingInt(n -> (int) n)));
    }
    return sortedList;
  }

  public static void main(String[] args) {
    List<Integer> sorted = medianSort(List.of(1, 3, 3, 6, 7, 8, 9));
    System.out.println(sorted);
  }

}
