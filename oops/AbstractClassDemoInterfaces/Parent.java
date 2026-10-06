package oops.AbstractclassDemo;

public abstract class Parent{

 
  final int VALUE;
  int age;
  
  public Parent(int age) {
    this.age = age;
    VALUE = 199;
  }

  abstract void career();
  abstract void partner();

  static void greet(){
    System.out.println("Hello how  r you");
  }


  void normal(){
    System.out.println("This is the normal method of parent class");
  }



}
