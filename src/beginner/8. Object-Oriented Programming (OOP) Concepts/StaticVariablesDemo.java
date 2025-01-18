// Class to demonstrate static variables
public class StaticVariablesDemo {
    // Instance variables
    private String brand;
    private int year;

    // Static variable (shared among all instances)
    private static int count = 0;

    // Constructor to initialize instance variables and update the static count
    public StaticVariablesDemo(String brand, int year) {
        this.brand = brand;
        this.year = year;
        count++; // Increment static count when an object is created
    }

    // Instance method to display car details
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }

    // Static method to display the total number of cars created
    public static void displayCount() {
        System.out.println("Total Cars created: " + count);
    }

    // Main method
    public static void main(String[] args) {
        // Creating instances of StaticVariablesDemo
        StaticVariablesDemo car1 = new StaticVariablesDemo("Toyota", 2020);
        StaticVariablesDemo car2 = new StaticVariablesDemo("Honda", 2022);

        // Accessing instance method
        car1.displayInfo(); // Output: Car brand: Toyota, Year: 2020
        car2.displayInfo(); // Output: Car brand: Honda, Year: 2022

        // Accessing static method
        StaticVariablesDemo.displayCount(); // Output: Total Cars created: 2
    }
}