// File: FinalKeywordDemo.java
public class FinalKeywordDemo {

    // 1. Final variable
    public static void finalVariableExample() {
        final int x = 10; // Declare a final variable
        System.out.println("Value of x: " + x);
        // x = 20; // Compile-time error: Cannot assign a value to final variable 'x'
    }

    // 2. Final method
    static class Animal {
        final void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        // Attempting to override a final method results in a compile-time error
        // void makeSound() {
        //     System.out.println("Dog barks");
        // }
    }

    public static void finalMethodExample() {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Animal makes a sound (inherited from Animal)
    }

    // 3. Final class
    final static class Vehicle {
        void type() {
            System.out.println("This is a vehicle");
        }
    }

    // The following class declaration would cause a compile-time error:
    // class Car extends Vehicle {
    //     void type() {
    //         System.out.println("This is a car");
    //     }
    // }

    public static void finalClassExample() {
        Vehicle vehicle = new Vehicle();
        vehicle.type(); // Output: This is a vehicle
    }

    public static void main(String[] args) {
        System.out.println("**Final Variable Example**");
        finalVariableExample();

        System.out.println("\n**Final Method Example**");
        finalMethodExample();

        System.out.println("\n**Final Class Example**");
        finalClassExample();
    }
}