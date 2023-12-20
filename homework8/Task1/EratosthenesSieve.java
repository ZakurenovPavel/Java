package Homeworks.HW8.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EratosthenesSieve {

  public static void main(String[] args) {
    System.out.println(findPrimes(30));
  }

  public static List<Integer> findPrimes(int n) {
    List<Integer> emptyList = new ArrayList<>();
    if (n == 1) {
      return emptyList;
    }
    int k = 0;
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> tempSet = new HashSet<>();
    for (int i = 2; i <= n; i++) {
      set.add(i);
    }
    while (k < Math.pow(n, 0.5)) {
      k = set.iterator().next();
      tempSet.add(k);
      int c = k;
      while (c <= n) {
        set.remove(c);
        c += k;
      }
    }
    List<Integer> list = new java.util.ArrayList<>(List.copyOf(tempSet));
    List<Integer> cutList = List.copyOf(set);
    list.addAll(cutList);
    return list;
  }
}
