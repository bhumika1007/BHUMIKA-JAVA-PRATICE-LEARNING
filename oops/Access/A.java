package oops.Acesses;
public class A {
  //private int num;
  //private means here the num reference variable would be access anywhere in this file
  protected int num;
  int[] arr;
  String name;
  
  //since here the method is public it would be access it from anywhere
  public int getNum() {
		return num;
	}

  public void setNum(int num) {
    this.num = num;
  }
  public A(int num,String name) {
    this.num = num;
    this.arr = new int[num];
    this.name = name;
  }

	
  
}
