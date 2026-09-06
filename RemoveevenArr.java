import java.util.ArrayList;
public class RemoveevenArr {
  public static void main(String[] args) {

      ArrayList <Integer> list = new ArrayList<>();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      System.out.println(list);

      list.removeIf(n -> n %2 == 0);

      System.out.println(list);

  }
}
