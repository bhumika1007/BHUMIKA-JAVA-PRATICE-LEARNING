package OOPS;

public class Creatingobj {
  public static void main(String[] args) {
      //declaring and creating the object
      Students Kunal = new Students();

      //Assignning values manually

      Kunal.rno = 20;
      Kunal.name = "Bhumika";
      Kunal.marks = 88.9f;
      
      System.out.println(Kunal.rno);
      System.out.println(Kunal.name);
      System.out.println(Kunal.marks);
  }
}
class Students{
  int rno;
  String name;
  float marks;
}
