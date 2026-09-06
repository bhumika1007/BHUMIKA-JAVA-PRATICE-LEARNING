import java.util.Arrays;
import java.util.Scanner;

public class Concatenarearr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] nums = new int[n];
    for(int i = 0;i < n;i++){
      nums[i] = in.nextInt();
    }
    int[] ans = new int[2*n];
    for (int i = 0; i < n; i++) {
        ans[i] = nums[i];
        ans[i+n] = nums[i];
        
    }
    System.out.println(Arrays.toString(ans));
        
    
  }
}