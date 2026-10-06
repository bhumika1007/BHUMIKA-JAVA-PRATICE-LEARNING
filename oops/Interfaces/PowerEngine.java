package oops.Interfaces;

public class PowerEngine implements Engine {

  @Override
  public void accelarate() {
    System.out.println("PowerEngine accelarates");
  }

  @Override
  public void start() {
    System.out.println("PoweEngine starts");
    
  }

  @Override
  public void stop() {
    System.out.println("PowerEngine stops");
  }
  
}
