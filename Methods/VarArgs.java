import java.util.Arrays;
public class VarArgs {
  public static void main(String[] args) {
      fun(12,3,4,5,6,8);
  }
  static void fun(int ...v){
    
    System.out.println(Arrays.toString(v));
  }
}
