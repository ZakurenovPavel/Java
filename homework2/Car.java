public class Car {
    private String colour;
    private int fuel;
    private final int maxFuel;
    private final String model;
    private final Engine engine;
    private int mileage;
    private int distance;

    public class Engine {
        boolean state;
        private int fuelConsumption;

        public Engine(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
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

    public Car(String colour, int fuel, int maxFuel, String model, int fuelConsumption, int distance) {
        this.colour = colour;
        this.fuel = fuel;
        this.maxFuel = maxFuel;
        this.model = model;
        this.engine = new Engine(fuelConsumption);
        this.mileage = mileage;
        this.distance = mileage;
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
        System.out.println("Пробег равен " + mileage + " км. С последнего запуска вы проехали " + lastDistance + " км");
    }

    public void info() {
        int lastDistance = mileage - distance;
        System.out.println("Цвет автомобиля: " + colour);
        System.out.println("Остаток топлива составляет: " + fuel + " литров");
        System.out.println("Вместимость бензобака: " + maxFuel + " литров");
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Автомобиль потребляет " + engine.getFuelConsumption() + " литров на 100 километров");
        System.out.println("Пробег равен " + mileage + " км. С последнего запуска вы проехали " + lastDistance + " км");
    }
}

