
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      //syntax
      ArrayList<Integer> list = new ArrayList<>();
      // Array functions
/*       list.add(3);
      list.add(4);
      list.add(234);
      list.add(445);
      list.add(21);
      list.add(89);
*/

//      System.out.println(list);
//      list.set(2,99);
//      System.out.println(list);
      // input
      for(int i = 0;i < 5;i++){
        list.add(in.nextInt());
      }

      //get item for any index
      for(int i = 0;i < 5;i++){
        System.out.println(list.get(i)); // pass index here, list[index] wont be work here.
      }
      System.out.println(list);
  }
}
