// Class definition for Car
public class Car {
    // Fields (attributes) of the class
    String brand;
    int year;

    // Constructor: Initializes objects of the class
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }
}

// Main class to demonstrate classes and objects
public class ClassAndObjectsDemo {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", 2020); // Car object with brand "Toyota" and year 2020
        Car car2 = new Car("Honda", 2022);  // Another Car object with brand "Honda" and year 2022

        // Calling methods on objects
        car1.displayInfo(); // Output: Car brand: Toyota, Year: 2020
        car2.displayInfo(); // Output: Car brand: Honda, Year: 2022
    }
}