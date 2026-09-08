package Bhuminew.Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Input {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    // int[] arr = new int[5];
    //Array of primitives:
    // arr[0] = 1;
    // arr[1] = 2;
    // arr[2] = 3;
    // arr[3] = 4;
    // arr[4] = 5;
    // //internally it store:{1,2,3,4,5}
    // System.out.println(arr[4]);

  
    //input using an for loops:
    // for(int i = 0; i < arr.length;i++){
    //   arr[i] = in.nextInt();
    // }
    // System.out.print(Arrays.toString(arr));
    // for(int i=0 ; i < arr.length; i++){

    //   System.out.print(arr[i] + " ");
    // }

    //enhanced for loop:
    // for(int num : arr){
    //   System.out.print(num + " ");
    // }

    // System.out.print(arr[5]);//index out of bound error

    //Array of Objects
    String[] str = new String[4];
    for (int i = 0; i < str.length; i++) {
        str[i] = in.next();
    }
    System.out.println(Arrays.toString(str));
    //modify the string
    str[1] = "Boomi";
    System.out.println(Arrays.toString(str));

  }
}
