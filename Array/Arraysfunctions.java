package Bhuminew.Arrays;

import java.util.Arrays;

public class Arraysfunctions {
  public static void main(String[] args) {
      int[] nums = {12,34,5,6,7};
      System.out.println(Arrays.toString(nums));
      change(nums);
      System.out.println(Arrays.toString(nums));
  }
  static void change(int[]arr) {
      arr[0] = 87;
  }
}
