package Homeworks.HW9.Task1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BindMultiply {

  static Function<Integer, Integer> multiplyByTwo = bind((a, b) -> a * b, 2); //task1


  public static void main(String[] args) {
    System.out.println("multiplyByTwo: " + multiplyByTwo.apply(50) + "\n");
  }

  //функция bind (фиксация одного аргумента)
  static <A, B, C> Function<B, C> bind(BiFunction<A, B, C> fn, A a) {
    return b -> fn.apply(a, b);
  }
}
