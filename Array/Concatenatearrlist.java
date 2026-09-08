
import java.util.ArrayList;
import java.util.Scanner;


public class Concatenatearrlist {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      ArrayList<Integer> nums = new ArrayList<>();
      for(int i = 0;i<n;i++){
        nums.add(in.nextInt());
      }
      ArrayList<Integer>result= new ArrayList<>(nums);
      result.addAll(nums);
      System.out.println(result);
      
  }
}
