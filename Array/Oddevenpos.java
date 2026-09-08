package Bhuminew.Arrays;

import java.util.Scanner;
public class Oddevenpos {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int[] arr = new int[6];
    for(int i = 0;i<6;i++){
      if(arr[i] %2 != 0){
        System.out.print(arr[i]);
      }
    }
  }
}
