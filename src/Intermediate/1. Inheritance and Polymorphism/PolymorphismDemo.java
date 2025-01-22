// File: PolymorphismDemo.java
public class PolymorphismDemo {

    // Compile-time Polymorphism (Method Overloading)
    static class Calculation {
        void sum(int a, int b) {
            System.out.println("Sum of two integers: " + (a + b));
        }

        void sum(double a, double b) {
            System.out.println("Sum of two doubles: " + (a + b));
        }
    }

    // Runtime Polymorphism (Method Overriding)
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        // Demonstrate Compile-time Polymorphism (Method Overloading)
        System.out.println("**Compile-time Polymorphism Example**");
        Calculation calc = new Calculation();
        calc.sum(10, 20); // Calls method with int parameters
        calc.sum(15.5, 25.3); // Calls method with double parameters

        // Demonstrate Runtime Polymorphism (Method Overriding)
        System.out.println("\n**Runtime Polymorphism Example**");
        Animal myAnimal; // Reference of superclass

        myAnimal = new Dog(); // Reference pointing to a Dog object
        myAnimal.sound(); // Calls Dog's overridden sound() method

        myAnimal = new Cat(); // Reference pointing to a Cat object
        myAnimal.sound(); // Calls Cat's overridden sound() method

        // Demonstrate Dynamic Method Dispatch
        System.out.println("\n**Dynamic Method Dispatch Example**");
        Animal animalReference = new Dog(); // Animal reference, Dog object
        animalReference.sound(); // Determined at runtime: Dog's sound method

        // Benefits of Polymorphism in action
        System.out.println("\n**Polymorphism in Action**");
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.sound(); // Calls respective sound() implementation
        }
    }
}