package Bhuminew.Methods;

import java.util.Scanner;

public class Stringex {
  public static void main(String[] args) {
      // String message = greet();
      // System.err.println(message);
      
      //By using an scanner class.
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = in.nextLine();
      String message = mygreet(name);
      //String message = mygreet("Bhumika");
      System.out.println(message);

  }
  static String mygreet(String name) {
        String msg = "Hello " +name;
        return msg;
    }
  // static String greet(){
  //   String greeting = "how are you?";
  //   return  greeting; 
  // }

    

    
}
