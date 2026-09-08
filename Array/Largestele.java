package Bhuminew.Arrays;

public class Largestele {
  public static void main(String[]args){
    int[] larg = {12,4,5,2,57};
    int largest = larg[0];
    for (int i = 0; i < larg.length; i++) {
        if(larg[i] > largest){
          largest = larg[i];
        }
    }
    System.out.println(largest);
  }
}
