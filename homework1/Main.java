import java.math.BigInteger;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // тут можете тестировать ваш код

    convert(10);
    System.out.println(normalize(-120));
    System.out.println(max(19, 18, 18));
    System.out.println(fact(12));
    System.out.println(fact(BigInteger.valueOf(10)));
    multiplTable();
    System.out.println(average());
    System.out.println(isMagicSquare(new int[][]{
        {16, 3, 2, 13},
        {5, 10, 11, 8},
        {9, 6, 7, 12},
        {4, 15, 14, 1}}));
    System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 5, 9, 8, 6})));
    System.out.println(Arrays.toString(sort(new int[]{2, 1, 45, 34, 12, 2})));
    System.out.println(Arrays.toString(
        removeExtra(new int[]{88, 21, 45, 112, 34, 6, 12, 2, 6, 33, 6, 11, 6, 4}, 6)));
  }

  // task 1
  static void convert(int arg) {
    // Ваш код здесь
    String binary = Integer.toBinaryString(arg);//binary есть arg в двоичной СС
    String octal = Integer.toOctalString(arg);//octal есть arg в восьмеричной СС
    String hex = Integer.toHexString(arg);//hex есть arg в шестнадцатеричной СС

    System.out.print(binary + " ");
    System.out.print(octal + " ");
    System.out.print(hex + " ");
  }


  // task 2
  static int normalize(int angle) {
    // Ваш код здесь
    if (angle >= 0) {
      angle = angle % 360;//если угол больше или равен 0, то выводим его остаток от деления на 360
    } else {
      while (angle < 0) {
        angle += 360;//если угол меньше 0, добавляем 360 пока он не станет больше или равен 0
      }
    }
    return angle;
  }


  // task 3
  static int max(int x, int y, int z) {
    // Ваш код здесь
    if (x >= y && x >= z) {
      return x;
    } else if (y >= x && y >= z) {
      return y;
    } else {
      return z;
    }
  }


  // task 4
  static int fact(int n) {
    // Ваш код здесь
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * fact(n - 1);
    }
  }


  // task 5
  static BigInteger fact(BigInteger n) {
    // Ваш код здесь
    if (BigInteger.ONE.equals(n) || BigInteger.ZERO.equals(n)) {
      return BigInteger.ONE;
    } else {
      return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
  }

  // task 6
  static void multiplTable() {
    // Ваш код здесь
    System.out.print("  ");
    for (int i = 1; i < 9; i++) {
      System.out.print(i);
      System.out.print("  ");
    }
    System.out.println(9);
    for (int i = 1; i < 10; i++) {
      System.out.print(i);
      System.out.print(" ");
      for (int j = 1; j < 9; j++) {
        System.out.print(j * i);
        if (i * j <= 9) {
          System.out.print(" ");
        }
        System.out.print(" ");
      }
      System.out.println(9 * i);
    }
  }


  // task 7
  static double average(int... nums) {
    // Ваш код здесь
    int len = nums.length;// len - это длина массива nums
    if (len == 0) {
      return 0;
    } else {
      int count = 0;//count - счетчик
      for (int i = 0; i < len; i++) {
        count += nums[i];//b - сумма всех элементов массива
      }
      return count / len;//возвращаем сумму вcех элементов, деленную на их количество.
    }
  }


  // task 8
  static boolean isMagicSquare(int[][] square) {
    // Ваш код здесь
    return false;
  }


  // task 9
  static int[] reverse(int[] arr) {
    // Ваш код здесь;
    int len = arr.length;// len - длина массива arr
    for (int i = 0; i < len / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[len - 1 - i];
      arr[len - 1 - i] = temp;
    }
    return arr;
  }


  // task 10
  static int[] sort(int[] arr) {
    // Ваш код здесь
    int len = arr.length;
    for (int i = 1; i < len; i++) {
      for (int j = 1; j < len; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }


  // task 11
  static int[] removeExtra(int[] arr, int n) {
    // Ваш код здесь
    int len = arr.length;
    int countExtra = 0;
    for (int i = 0; i < len; i++) {
      if (arr[i] != n) {
        countExtra += 1;
      }
    }
    int[] newMas = new int[countExtra];
    int count = 0;
    for (int i = 0; i < len; i++) {
      if (arr[i] != n) {
        newMas[count] = arr[i];
        count += 1;
      }
    }
    return newMas;
  }
}

