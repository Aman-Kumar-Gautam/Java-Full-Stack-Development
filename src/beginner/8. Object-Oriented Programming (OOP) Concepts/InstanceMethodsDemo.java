// Class to demonstrate instance methods
public class InstanceMethodsDemo {
    // Instance variables
    private String brand;
    private int year;

    // Constructor
    public InstanceMethodsDemo(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Instance method to display information about the car
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }

    // Instance method to check if the car is older than a given year
    public boolean isOlderThan(int compareYear) {
        return year < compareYear;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        InstanceMethodsDemo myCar = new InstanceMethodsDemo("Honda", 2015);

        // Accessing instance methods
        myCar.displayInfo(); // Output: Car brand: Honda, Year: 2015

        // Using the isOlderThan method
        boolean older = myCar.isOlderThan(2020);
        System.out.println("Is the car older than 2020? " + older); // Output: Is the car older than 2020? true
    }
}