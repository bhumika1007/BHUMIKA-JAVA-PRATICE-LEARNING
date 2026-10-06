package oops.Interfaces;

public class Main {
  public static void main(String[] args) {
    //Car car = new Car();

    //so here we are accesing only the Engine methods and not the brake method because 
    // we are using Engine reference variable to access the methods of Car class
    //Engine car = new Car();
    // car.start();
    // car.accelarate();
    // // car.brake();
    // car.stop();

    // Media carmedia = new Car();
    // carmedia.stop();

    NiceCar car = new NiceCar();
    car.start();
    car.stop();
    car.startMusic();
    car.stopMusic();
  }
}
