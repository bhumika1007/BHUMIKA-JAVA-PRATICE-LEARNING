package Bhuminew.Methods;

public class Scope {
  public static void main(String[] args) {
      int a = 10;
      int b = 20;
      {
        //int a = 78;//already intialized ourside the block in the same method,hence you cannot initiaed again
        a = 100;
        int c = 99;//values initilaled in this block,will remain in block
      }
      
      S//ystem.out.println(c);
      System.out.println(a);
  }
  System.out.println(a);
  static void random(int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);
  }
}
