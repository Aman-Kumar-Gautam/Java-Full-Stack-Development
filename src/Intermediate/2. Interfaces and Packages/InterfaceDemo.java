// File: InterfaceDemo.java

// 1. Normal Interface
interface Animal {
    // Abstract method
    void makeSound();

    // Default method (from Java 8)
    default void eat() {
        System.out.println("Animal is eating");
    }

    // Static method (from Java 8)
    static void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// 2. Functional Interface (Single Abstract Method)
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Single abstract method
}

// 3. Marker Interface
interface MarkerInterface {
    // No methods or fields (used to mark classes for special behavior)
}

// Implementing a normal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Using a functional interface with lambda expression
class FunctionalInterfaceExample {
    public static void functionalInterfaceDemo() {
        Calculator add = (a, b) -> a + b; // Lambda expression
        System.out.println("Sum: " + add.calculate(5, 3)); // Output: Sum: 8
    }
}

// Using a marker interface
class MarkerExample implements MarkerInterface {
    public void checkMarker() {
        System.out.println("This class implements a marker interface");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Normal Interface Example
        System.out.println("**Normal Interface Example**");
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
        myDog.eat();       // Output: Animal is eating
        Animal.sleep();    // Output: Animal is sleeping

        // Functional Interface Example
        System.out.println("\n**Functional Interface Example**");
        FunctionalInterfaceExample.functionalInterfaceDemo();

        // Marker Interface Example
        System.out.println("\n**Marker Interface Example**");
        MarkerExample marker = new MarkerExample();
        marker.checkMarker(); // Output: This class implements a marker interface
    }
}