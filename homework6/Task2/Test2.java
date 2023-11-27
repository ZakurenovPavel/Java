package Task2;

public class Test2 {

  public static void main(String[] args) {
    Tuple<Integer> tuple = new Tuple<>(5);
    assert tuple.isEmpty();
    tuple.add(2);
    tuple.add(10, 1);
    tuple.add(4, 2);
    tuple.add(5, 3);
    System.out.println(tuple.get(0));
    System.out.println(tuple.get(1));
    System.out.println(tuple.get(2));
    System.out.println(tuple.get(3));
    assert tuple.get(0) == 2;
    assert tuple.get(1) == 10;
    assert tuple.get(2) == 4;
    assert tuple.get(3) == 5;
    assert tuple.orElse(6, 100) == 100;
    tuple.remove(2);
    assert tuple.get(2) == 5;
    tuple.remove(Integer.valueOf(10));
    assert tuple.get(1) == 5;
    System.out.println("OK");
  }
}
