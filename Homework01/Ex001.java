package Homework01;

public class Ex001 {
  public static void main(String[] args) {

  }

  void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  int summEl(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }
}
