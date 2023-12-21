package Homeworks.HW9.Task4;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamMappedList {

  public static void main(String[] args) {
    List<Integer> nums = List.of(15, 2, 5, 4, 1);
    List<Integer> nums2 = List.of(15, 2, 5, 5, 1);
    int k = 4;
    Optional<Integer> answer = processElements(nums, i -> i > k,  Integer::signum, Integer::sum);
    Optional<Integer> answer2 = processElements(nums2, i -> i > k,  Integer::signum, Integer::sum);
    answer.ifPresent(System.out::println);
    answer2.ifPresent(System.out::println);
    //подсчитываем количество положительных целых чисел массива, больших данного .
  }

  public static <T, R> Optional<R> processElements(List<T> elements,
      Predicate<T> predicate,
      Function<T, R> mapper,
      BinaryOperator<R> operator) {
    return elements.stream()
        .filter(predicate)
        .map(mapper)
        .reduce(operator);
  }

}
