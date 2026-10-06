package oops.Inheritance;

public class BoxWeight extends Box{
  double weight;

  public BoxWeight(){
    this.weight = -1;
  }

  BoxWeight(double side,double weight){
    super(side);
    this.weight = weight;
  }

  public BoxWeight(double l, double w, double h, double weight) {
    super(l, w, h);//call the parent class
    //used to initilise the values present in the parent class
    this.weight = weight;
    System.out.println(super.weight);
  }
  
}


