package oops.Inheritance;

//Multilevel inheritance
public class BoxPrice extends BoxWeight {
  
  double cost;
  //No Arguement constructor of box price
  BoxPrice() {
    super();//it would call the boxweight then the boxweight() automatically calls the Box() constructor
    //so the chain is Boxprice:Boxweight:BOx
    this.cost = -1;
  }

  BoxPrice(BoxPrice other){
    super(other);
    this.cost = other.cost;
  }

  public BoxPrice(double cost) {
    this.cost = cost;
  }

  public BoxPrice(double l, double w, double h, double weight,double cost) {
    super(l, w, h, weight);
    this.cost = cost;
  }

  public BoxPrice(double side,double weight,double cost){
    super(side,weight);
    this.cost = cost;
  }
  
}
