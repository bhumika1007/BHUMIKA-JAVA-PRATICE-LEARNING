package oops.Interfaces.Nested;

public class A {
  //nested interface
  public interface NestedInterface{
    boolean isOdd(int num);
  }

}
class B implements A.NestedInterface{

  @Override
  public boolean isOdd(int num) {
    // TODO Auto-generated method stub
    return (num & 1) == 1;
  }
  
}
