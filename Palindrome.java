import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a palindrome: ");
    int N = sc.nextInt();
    String name = String.valueOf(N);
    String reversed = new StringBuilder(name).reverse().toString();
    if(name.equals(reversed)){
      System.out.println("Palindrome");
    }else{       
      System.out.println("Not Palindrome");
    }
  }
} 

