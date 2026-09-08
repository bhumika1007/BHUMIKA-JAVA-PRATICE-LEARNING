import java.util.Scanner;

public class Some {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of num1: ");
    float num1 = input.nextInt();
    System.out.println("Enter the value of num2: ");
    float num2 = input.nextInt();
    float sum = num1 + num2;

    System.out.println("Sum of the two values is " + sum);

  }
}
