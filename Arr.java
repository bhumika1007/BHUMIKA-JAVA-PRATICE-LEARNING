public class Arr {
  public static void main(String[]Args){
    //Q:Store a roll no
    //int a = 19;

    //Q:Store a persons name
    //String name = "Bhumika";

    //Q:Store 5 roll numbers
    //int rno1 = 23;
    //int rno2 = 45;
    //int rno3 = 13;

    //Syntax
    //dataType[] variable_name = new dataType[size];
    // store 5 roll numbers:
    //int[] rnos = new int[6];
    //or directly
    //int[] rnos2 = {5,6,7,8,9,10,12};  

    int[] rnos; //declaration of array, ros is getting defined in the stack
    rnos = new int[5]; // initialisation : actually here object is being created in the memory(heap)

  //  System.out.println(rnos[1]);
    String[] arr = new String[4];
    System.out.println(arr[0]);
  }
}
 