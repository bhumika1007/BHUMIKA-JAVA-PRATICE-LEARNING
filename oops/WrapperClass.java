package oops;

public class WrapperClass {
  public static void main(String[] args) {
      // int a =10;
      // int b = 4;

      // Integer num = 3;

      Integer a = 12;
      Integer b = 24;

      swap(a,b);
      System.out.println(a + " " + b);

      //final keyword - variable cannot be modified
      final int bounus = 5;
      bonus = 3;

      final A kunal = new A("Kunal kushwahaaa");
      kunal.name = "other name";

      //when a non primitive is final,you cannot be reassign it.
      //Kunal = new A("new object");
  }

  static void swap(Integer a,Integer b){
    //int temp = a;
    Integer temp = a;
    a = b;
    b = temp;
  }
}


class A{
  final int num = 10;
  String name;

  public A(String name){
    this.name = name;
  }
}
