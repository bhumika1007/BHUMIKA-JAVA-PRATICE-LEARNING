package Bhuminew.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Multidimensionarr {
  public static void main(String[] args) {
      /*
      1 2 3
      4 5 6
      7 8 9
      */
     Scanner in = new Scanner(System.in);
    //  int[][]arr = new int[3][3]

    // int[][] arr = {
    //             {1,2,3},//0th index   
    //             {4,5}, //1st index
    //             {6,7,8,9} //2nd index - arr2D[2] = {6,7,8,9},arr2D[2][0] = {6}
    // };
    int[][]arr = new int[3][3];
    // System.out.println(arr.length); // it will print the number of rows
    //Input
    for(int row = 0;row < arr.length; row++){
          //for each colummn in every row take the input for that
          for(int col = 0;col < arr[row].length;col++){
            arr[row][col] = in.nextInt();
          }
    }

    //Output
    //  for(int row = 0;row < arr.length; row++){
    //       //for each colummn in every row take the input for that
    //       for(int col = 0;col < arr[row].length;col++){
    //         System.out.print(arr[row][col] +" ");
    //       }
    //       System.out.println();
    // }

    //By uisng an enhanced for loop:
    // for (int row = 0; row < arr.length; row++) {
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    //Enhanced for loop:
    for(int[] a : arr){
      System.out.println(Arrays.toString(a));
    }

     
  }
}
