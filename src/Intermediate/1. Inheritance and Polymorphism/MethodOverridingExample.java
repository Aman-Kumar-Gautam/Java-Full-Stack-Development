// Parent class
class Vehicle {
    void sound() {
        System.out.println("A vehicle makes a generic sound");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void sound() {
        System.out.println("A car goes vroom vroom");
    }
}

// Subclass 2
class Bike extends Vehicle {
    @Override
    void sound() {
        System.out.println("A bike goes brum brum");
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        // Create an object of the parent class
        Vehicle myVehicle = new Vehicle();
        myVehicle.sound(); // Output: A vehicle makes a generic sound

        // Create an object of the Car class
        Vehicle myCar = new Car(); // Polymorphism in action
        myCar.sound(); // Output: A car goes vroom vroom

        // Create an object of the Bike class
        Vehicle myBike = new Bike(); // Polymorphism in action
        myBike.sound(); // Output: A bike goes brum brum
    }
}
