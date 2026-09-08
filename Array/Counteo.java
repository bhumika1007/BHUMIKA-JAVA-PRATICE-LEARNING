package Bhuminew.Arrays;

public class Counteo {
  public static void main(String[] args) {
    int[] arr = {12,1,10,5,6,7,11};
      int even = 0;
      int odd = 0;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i] % 2 == 0){
            even++;
          }else{
            odd++;
          }
          
      }
      System.out.println("The even number is:" +even);
      System.out.println("The odd number is:"+odd);
  }
}
