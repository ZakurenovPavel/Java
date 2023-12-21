package Homeworks.HW9.Task3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CurryGreeting {

  static Function<String, String> sayHello = saySmth("Hello");

  public static void main(String[] args) {
    System.out.println(sayHello.apply("Andrew"));
  }

  static Function<String, String> saySmth(String greeting) {
    BiFunction<String, String, String> transform = (a, b) -> a + ", " + b + "!";
    return curry(transform).apply(greeting);
  }

  //функция curry (последовательное применение одинаковых функций)
  static <A, B, C> Function<A, Function<B, C>> curry(BiFunction<A, B, C> fn) {
    return a -> b -> fn.apply(a, b);
  }
}
