// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Subclass inheriting from Car
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging...");
    }
}

public class multiInheritance {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.start();  // Inherited from Vehicle
        myCar.drive();  // Inherited from Car
        myCar.charge(); // Method of ElectricCar class
    }
}