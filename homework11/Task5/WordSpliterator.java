package Homeworks.HW9.Task5;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class WordSpliterator implements Spliterator<String> {

  String[] textArray;
  int current;
  int last;

  public WordSpliterator(String text) {
    this.textArray = text.split(" ");
    this.current = 0;
    this.last = textArray.length;
  }

  public WordSpliterator(String[] textArray, int current, int last) {
    this.textArray = textArray;
    this.current = current;
    this.last = last;
  }

  public static void main(String[] args) {
    String text = "This is a sample sentence demonstrating custom Spliterator implementation";
    String lastText = "Is it my last Java Homework at this year?";
    Stream<String> wordStream = StreamSupport.stream(new WordSpliterator(text), false);
    wordStream.forEach(System.out::println);
    Stream<String> lastWordStream = StreamSupport.stream(new WordSpliterator(lastText), false);
    lastWordStream.forEach(System.out::println);

    //Сплитераторы придумали в 16 веке:
    String nums = "1 2 3 4 5 6 7 8 9";
    Stream<String> fromOnetoNine = StreamSupport.stream(new WordSpliterator(nums), false);
    fromOnetoNine.forEach(System.out::println);
    //Люди до:
    for (int i = 1; i < 10; i++) {
      System.out.println(i);
    }
  }

  @Override
  public boolean tryAdvance(Consumer<? super String> action) {
    if (current >= last) {
      return false;
    }
    action.accept(textArray[current]);
    current++;
    return true;
  }

  @Override
  public Spliterator<String> trySplit() {
    if (estimateSize() < 2) {
      return null;
    }
    int middle = (current + last) / 2;
    Spliterator<String> halfSplit = new WordSpliterator(textArray, current, last);
    current = middle;
    return halfSplit;
  }

  @Override
  public long estimateSize() {
    return last - current;
  }

  @Override
  public int characteristics() {
    return ORDERED | SIZED | SUBSIZED | IMMUTABLE | CONCURRENT;
  }
}
