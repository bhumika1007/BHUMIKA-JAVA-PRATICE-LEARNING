package oops.Inheritance;

public class Main {
  public static void main(String[] args) {
    //java calls the Box() constructor
      //Box box = new Box();
    //call it by one value use this
      //Box box = new Box(5);
    //call it for an all the three values were been called by an normal box
      //Box box = new Box(3,5,6);

    //copy constructor
      // Box box1 = new Box(2,3,4);
      // Box box2 = new Box(box1);
      // System.out.println(box1.l + " " + box1.w + " " + box1.h);

      //create it for the Boxweight
      // BoxWeight box3 = new BoxWeight();
      // BoxWeight box4 = new BoxWeight(2,3,4,5);
      // System.out.println(box3.l + " " + box3.weight);

      Box box5 = new BoxWeight (1,2,3,4);
      System.out.println(box5.w);//in this we can only access the l,w,h not an weight 
      //why because? weight belongs to Boxweight not an box.
      //so we can't directly access the box5.weight here
      //reference type = BOx
      //Obj type = BoxWEight 


      //there are many variables in both parent and child classes
      //you are given access to the variables that are in the ref type i.e BoxWeight
      //hence you shuold have the acces to the wieght variable.
      //when we are trying to access should be initialised
      //when the object itself is the of type parent class, how will you call the consturctor of the child class
      //so it would gives an error here
  //     BoxWeight box6 = new Box(2,3,4);
  //     System.out.println(box6);


  //Multilevel inheritance
    BoxPrice box = new BoxPrice(5,4,1000);
  }
}
