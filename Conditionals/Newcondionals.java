package Bhuminew.Conditionals;

public class Newcondionals {
  public static void main(String[] args) {
      /*
        syntax of if statements
        if(boolean expression T or F){
            //body
        }else{
            //do this
        }
      */
     int salary = 1000000;
      // if(salary>10000){
      //   salary = salary + 3000;
      // }else{
      //   salary = salary + 2000;
      // }
      // System.out.println(salary);
      
      // Multiple if else statement
      if(salary>10000){
        salary += 3000;
      }if (salary>400000) {
        salary+=2000;
      } else {
        salary+=500;
      }
      System.out.println(salary);

  }
}
