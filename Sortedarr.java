import java.util.Scanner;
public class Sortedarr {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int[] arr = new int[5];
    for(int i = 0;i < arr.length;i++){
      arr[i] = in.nextInt();
    }
    boolean isSorted = true;

    for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
    }
    if(isSorted){
      System.out.println("Array is sorted");
    }else{
      System.out.println("Array is not sorted");
    }
  }
}
