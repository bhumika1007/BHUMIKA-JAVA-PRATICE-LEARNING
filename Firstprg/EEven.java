package Bhuminew;

import java.util.Scanner;

public class EEven {
  public static void main(String[]Args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number:");
    int number = input.nextInt();
    if(number%2==0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
    
  }
}
