package oops.AbstractclassDemo;

public class Main {
  public static void main(String[]args){
    Son son = new Son(20);
    son.career();
    son.normal();

    Parent daughter = new Daughter(25);
    daughter.career();

    Parent.greet();
  }
}
