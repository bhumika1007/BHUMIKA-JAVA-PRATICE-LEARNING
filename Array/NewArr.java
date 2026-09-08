package Bhuminew.Arrays;

public class NewArr {
  public static void main(String[] args) {
      //Q.store a roll number
      int a = 16;

      //Q.store a person's name
      String name = "Hello Bhumi";

      //Q.store 5 roll number
      // int[] rno1 = 5;
      // int[] rno2 = 6;
      // int[] rno3 = 7;

      //sytnax
      //datatype[] variable_name = new datatype[size];
      //store 5 roll numbers:
      // int[] rnos = new int[5];
      // //or directly
      // int[] rnos2 = {1,2,3,4,5};

      int[] rnos; //declaration of array: ros is getting defined in the stack
      rnos = new int[5]; //initialisation: actually here object is being created in the heap memory.

      // System.out.println(rnos[1]);
      String[] arr = new String[4];
      System.out.println(arr[0]);
      

  }
}
