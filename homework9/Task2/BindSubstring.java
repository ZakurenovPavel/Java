package Homeworks.HW9.Task2;


import java.util.function.BiFunction;
import java.util.function.Function;

public class BindSubstring {

  static Function<String, String> substringFrom0To5 = bind((a, b) -> b.substring(0, a), 5);

  public static void main(String[] args) {
    System.out.println("substringFrom0To5: " + substringFrom0To5.apply("Helloblablabla") + "\n");
  }

  static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
    return b -> fn.apply(a, b);
  }

}
