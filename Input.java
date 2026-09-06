import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      // array of primitives
      int arr[] = new int[5];
      arr[0] = 234;
      arr[1] = 456;
      arr[2] = 645;
      arr[3] = 345;
      arr[4] = 256;

      System.out.println(arr[4]);

      // input using for loops
//      for(int i = 0;i < arr.length;i++){
//        arr[i] = in.nextInt();
//      }
//      System.out.println(Arrays.toString(arr));
//      for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");
//      }

//      for(int num : arr){ // for every element in array, print the element
//        System.out.print(num + "  "); // here num represents a element array
//      }

        // array of objects
        String[] str = new String[4];
        for(int i = 0;i < str.length;i++){
          str[i] = in.next();
        }

//       for (int i = 0; i < str.length; i++) {
//            System.out.print(str[i] + " ");
//     }
       System.out.println(Arrays.toString(str));
    }
}
 