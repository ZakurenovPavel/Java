package HW2.Task7;

public class TopCar {

  private final int maxFuel;
  private final String model;
  private final Engine engine;
  private String colour;
  private int fuel;
  private int mileage;
  private int distance;

  private TopCar(Builder builder) {
    this.maxFuel = builder.maxFuel;
    this.model = builder.model;
    this.engine = new TopCar.Engine(builder.fuelConsumption);
    this.colour = builder.colour;
    this.fuel = builder.fuel;
    this.mileage = builder.mileage;
  }


  public static void main(String[] args) {
    TopCar carInMyOwn = new TopCar.Builder(200, "Tesla", 10)
        .colour("blue")
        .fuel(5)
        .mileage(30)
        .build();

    carInMyOwn.refuel(30);
    carInMyOwn.move();
    carInMyOwn.getDistance();
    carInMyOwn.info();
    carInMyOwn.startEngine();
  }

  public void refuel() {
    fuel = maxFuel;
    System.out.println("Машина полностью заправлена");
  }

  public void refuel(int volume) {
    if (fuel + volume > maxFuel) {
      fuel = maxFuel;
      System.out.println("Объем топлива больше объема бака. Машина заправлена до полного бака");
    } else {
      fuel = fuel + volume;
      System.out.println("Машина заправлена на " + volume + " литров топлива");
    }
  }

  public void nofuel() {
    if (fuel == 0) {
      engine.turnOff();
      System.out.println("Топливо на нуле. Необходимо заправиться");
    }
  }

  public void startEngine() {
    if (fuel > 0) {
      engine.turnOn();
      System.out.println("Двигатель запущен");
    } else {
      nofuel();
    }
  }

  public void stopEngine() {
    engine.turnOff();
    System.out.println("Движок остановлен");
  }

  public void move() {
    engine.turnOn();
    while (engine.state) {
      int fuelConsumption = engine.getFuelConsumption();
      if (fuel >= fuelConsumption) {
        mileage += 100;
        fuel = fuel - fuelConsumption;
      } else {
        mileage += 100 * fuel / fuelConsumption;
        fuel = 0;
        engine.turnOff();
        System.out.println("Топливо закончилось. Двигатель остановлен");
      }
    }
  }

  public void getDistance() {
    int lastDistance = mileage - distance;
    System.out.println(
        "Пробег равен " + mileage + " км. С последнего запуска вы проехали " + lastDistance
            + " км");
  }

  public void info() {
    int lastDistance = mileage - distance;
    System.out.println("Цвет автомобиля: " + colour);
    System.out.println("Остаток топлива составляет: " + fuel + " литров");
    System.out.println("Вместимость бензобака: " + maxFuel + " литров");
    System.out.println("Модель автомобиля: " + model);
    System.out.println(
        "Автомобиль потребляет " + engine.getFuelConsumption() + " литров на 100 километров");
    System.out.println(
        "Пробег равен " + mileage + " км. С последнего запуска вы проехали " + lastDistance
            + " км");
  }

  @Override
  public String toString() {
    return "Car{" +
        "maxFuel=" + maxFuel +
        ", model='" + model + '\'' +
        ", engine=" + engine +
        ", colour='" + colour + '\'' +
        ", fuel=" + fuel +
        ", mileage=" + mileage +
        ", distance=" + distance +
        '}';
  }

  public static class Builder {

    private final int maxFuel;
    private final String model;
    private final int fuelConsumption;
    private TopCar.Engine engine;
    private String colour;
    private int fuel;
    private int mileage;

    public Builder(int maxFuel, String model, int fuelConsumption) {
      this.maxFuel = maxFuel;
      this.model = model;
      this.fuelConsumption = fuelConsumption;
    }

    private Builder calories(TopCar.Engine val) {
      engine = val;
      return this;
    }

    public Builder colour(String name) {
      colour = name;
      return this;
    }

    public Builder fuel(int val) {
      fuel = val;
      return this;
    }

    public Builder mileage(int val) {
      mileage = val;
      return this;
    }

    public TopCar build() {
      return new TopCar(this);
    }
  }

  private class Engine {

    boolean state;
    private final int fuelConsumption;

    public Engine(int fuelConsumption) {
      this.fuelConsumption = 10;
      this.state = false;
    }

    public void turnOn() {
      state = true;
    }

    public void turnOff() {
      state = false;
    }

    public int getFuelConsumption() {
      return fuelConsumption;
    }

  }
}
