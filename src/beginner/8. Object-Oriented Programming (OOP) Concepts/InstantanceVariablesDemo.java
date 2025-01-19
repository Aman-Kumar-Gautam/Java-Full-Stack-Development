// Class to demonstrate instance variables
public class InstantanceVariablesDemo {
    // Instance variables
    private String brand; // Brand of the car
    private int year;     // Year of manufacture

    // Constructor to initialize instance variables
    public InstantanceVariablesDemo(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }

    // Getter method for brand
    public String getBrand() {
        return brand;
    }

    // Setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        InstantanceVariablesDemo myCar = new InstantanceVariablesDemo("Toyota", 2020);

        // Accessing instance variables using methods
        myCar.displayInfo(); // Output: Car brand: Toyota, Year: 2020

        // Updating instance variables using setters
        myCar.setYear(2022);
        System.out.println("Updated year: " + myCar.getYear()); // Output: Updated year: 2022
    }
}