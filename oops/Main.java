package OOPS;

public class Main {
  public static void main(String[] args) {
      //store 5 roll numbers
      int[] numbers = new int[5];

      //store 5 student name
      String[] names = new String[5];

      // create an data type that should be store all the name,rollnum,marks(store all the data type)
      // so here we should create the name,rollnumber,marks
      int[] rno = new int[5];
      String[] name = new String[5];
      float[] marks = new float[5];
      // in this we are created the differnt different datatype for every single property

      Student[] students = new Student[5];  
      
      //just declaring
      // Student Bhumi;
      // //initializing
      // Bhumi = new Student();
//just declaring
      //like this also we can be do it

      //creating objects
      Student Bhumi = new Student(12,"Bhumi",90);
      Student Rahul = new Student();
      //System.out.println(Bhumi);

      //Accessing the reference variable
      // Bhumi.rno = 10;
      // Bhumi.name = "BHUMIKA";
      // Bhumi.marks = 88.9f;//for this we need to use an constructor because it is so repetitive
      // Bhumi.changeName("blablaablaa");
      // Bhumi.greeting();

      //Accessing the object values
      System.out.println(Bhumi.rno);//0(When we does not declare the value it gives an default valus)
      System.out.println(Bhumi.name);//null
      System.out.println(Bhumi.marks);//0.0
      
      //Copy constructr
      Student random = new Student(Bhumi);
      System.out.println(random.name);
      System.out.println(random.marks);
      //System.out.println(Arrays.toString(students));
      
  }
}

//Create an class
//this is the data type for the every single student

class Student{
  int rno;
  String name;
  float marks = 90;

  //we need the way to add the values of the above properties object by object

  //we need one word to access the every object
    //create an constructor

  void greeting(){
      System.out.println("Hello! My name is " + this.name);
    }

  //Change Name method
  void changeName(String newName){
    name = newName;
  }

  //Copy constructor
  Student(Student other) {
    name = other.name;
    this.rno = other.rno;
    this.marks = other.marks;
  }

  //No Argument Constructor
  Student() {
    this.rno = 10;
    this.name = "BHUMIKA";
    this.marks = 88.9f;//here this referes to the  Bhumi object so it call internaly that 
  }


  //Student
  //parameterized consructor
  Student(int roll,String Name,float Mark) {
    this.rno = roll;
    this.name = Name;
    this.marks = Mark;
  }
  
}
    
