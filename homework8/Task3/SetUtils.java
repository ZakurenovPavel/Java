package Homeworks.HW8.Task3;

import java.util.Set;

public class SetUtils {
  public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
    Set<E> set = new java.util.HashSet<>(Set.of());
    set.addAll(s1);
    set.addAll(s2);
    return set;
  }

  public static <E> Set<E> intersection(Set<? extends E> s1, Set<? extends E> s2) {
    Set<E> set = new java.util.HashSet<>(Set.of());
    set.addAll(s1);
    set.retainAll(s2);
    return set;
  }

  public static <E> Set<E> difference(Set<? extends E> s1, Set<? extends E> s2) {
    Set<E> set = new java.util.HashSet<>(Set.of());
    set.addAll(s1);
    set.removeAll(s2);
    return set;
  }

  public static <E> Set<E> symmetricDifference(Set<? extends E> s1, Set<? extends E> s2) {
    Set<E> set = new java.util.HashSet<>(Set.of());
    set.addAll(s1);
    set.addAll(s2);
    set.removeAll(intersection(s1, s2));
    return set;
  }
}
