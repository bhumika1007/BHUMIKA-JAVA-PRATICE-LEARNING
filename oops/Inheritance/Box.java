package oops.Inheritance;

public class Box {
  double l;
  double w;
  double h;
  double weight;

  //1.Default/No-argument constructor
  Box() {
    this.h = -1;
    this.l = -1;
    this.w = -1;
  }

  //2.cube
  //it takes only the one value
  Box(double side){

    super(); //To call this constructror it would call the object class

    this.h = side;                                                 
    this.l = side;                                                 
    this.w = side;                                                
  }

  //3.Normal box
  //it takes the three values here length,height,widtth
  public Box(double l, double w, double h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }                                                                                                        

  //4.COpy consturctor
  //it take the another Box object as the parameter
  Box(Box old){
    this.h = old.h;
    this.l = old.l;
    this.w = old.w;
  }
  public void information(){
    System.out.println("Running the box");
  }
      
}
