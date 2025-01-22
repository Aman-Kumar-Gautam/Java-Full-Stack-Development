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
