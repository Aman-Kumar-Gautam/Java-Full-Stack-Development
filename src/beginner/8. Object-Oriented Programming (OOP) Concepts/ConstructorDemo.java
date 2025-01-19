// Class definition for demonstrating constructors
public class ConstructorDemo {
    // Fields (attributes) of the class
    String name;
    int age;

    // 1. Default constructor (no parameters)
    public ConstructorDemo() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called: No arguments provided.");
    }

    // 2. Parameterized constructor (with parameters)
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called: Name and Age initialized.");
    }

    // 3. Copy constructor (creating an object by copying another object)
    public ConstructorDemo(ConstructorDemo another) {
        this.name = another.name;
        this.age = another.age;
        System.out.println("Copy constructor called: Object copied.");
    }

    // Method to display the object's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using default constructor
        ConstructorDemo obj1 = new ConstructorDemo();
        obj1.displayInfo(); // Output: Name: Unknown, Age: 0

        // Using parameterized constructor
        ConstructorDemo obj2 = new ConstructorDemo("Alice", 25);
        obj2.displayInfo(); // Output: Name: Alice, Age: 25

        // Using copy constructor
        ConstructorDemo obj3 = new ConstructorDemo(obj2);
        obj3.displayInfo(); // Output: Name: Alice, Age: 25
    }
}