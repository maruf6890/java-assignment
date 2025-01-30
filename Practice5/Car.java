
package Practice5;
class Car {
    String owner;
    String brand;
    String serialNumber;
    boolean isRunning;
    double fuelLevel;

    Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start. Fuel is empty!");
        }
    }

    void stopCar() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters");
    }

    void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Refueled " + amount + " liters. Current fuel level: " + fuelLevel + " liters");
        } else {
            System.out.println("Invalid fuel amount!");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("maruf", "toyota", "ABC", 10);
        myCar.checkFuel();
        myCar.startCar();
        myCar.stopCar();
        myCar.refuel(5);
        myCar.fuelLevel = 20;
        System.out.println("Updated fuel level: " + myCar.fuelLevel);
    }
}
