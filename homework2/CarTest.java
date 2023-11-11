public class CarTest {

  public static void main(String[] args) {
    Car carInMyOwn = new Car("Кофейный", 50, 100, "Bugatti", 30, 200);
    carInMyOwn.refuel(30);
    carInMyOwn.move();
    carInMyOwn.getDistance();
    carInMyOwn.info();
    carInMyOwn.startEngine();
  }
}

