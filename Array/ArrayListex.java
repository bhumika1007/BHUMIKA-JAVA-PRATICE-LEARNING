package Bhuminew.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //syntax
    ArrayList<Integer> list = new ArrayList<>(10);

    // list.add(654);
    // list.add(45);
    // list.add(3);

    // System.out.println(list);
    // list.set(1, 68);
    // System.out.println(list);
    // System.out.println(list.contains(3));

    //input
    for(int i = 0;i<5;i++){
      list.add(in.nextInt());
    }

    //get an item at any index
    for(int i = 0;i<5;i++){
      System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
    }
    System.out.println(list);

    
  }
}
