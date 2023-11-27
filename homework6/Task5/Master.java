package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Master {

  public static void main(String[] args) {
    List<Integer> values = List.of(0, 1, 1, 0, 0);
    List<Integer> mappedValues = map(values, x -> 1 - x);
    System.out.println(mappedValues);
  }

  public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
    ArrayList<R> answer = new ArrayList<>();
    for (T element : list) {
      R mappedElement = function.apply(element);
      answer.add(mappedElement);
    }
    return answer;
  }
}
