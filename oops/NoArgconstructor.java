package OOPS;

public class NoArgconstructor {
  public static void main(String[]args){
    Studentt Raghul = new Studentt();

    System.out.println(Raghul.rno);
    System.out.println(Raghul.name);
    System.out.println(Raghul.marks);
  }
}
class Studentt{
  int rno;
  String name;
  float marks;

  Studentt(){
    this.rno = 20;
    this.name = "Rahina";
    this.marks = 89f;
  }
}
