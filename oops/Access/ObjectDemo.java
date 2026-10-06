package oops.Acesses;

public class ObjectDemo {

  int num;
  Float gpa;
  public ObjectDemo(int num,float gpa) {
    this.num = num;
    this.gpa = gpa;
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    //return super.hashCode();
    return num;//it would gives that the number itself
  }

  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }

  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
  
  public static void main(String[]args){
    ObjectDemo obj = new ObjectDemo(37,56.7f);//in java it could gives an random number
    ObjectDemo obj2 = new ObjectDemo(61,71.2f);

    if(obj == obj2){
      System.out.println("obj1 is equal to obj2");
    }

    System.out.println(obj.getClass().getName());
    // System.out.println(obj.hashCode());
    // System.out.println(obj2.hashCode());
  }
}
