// File: AbstractClassDemo.java
public class AbstractClassDemo {

    // Abstract class with abstract and concrete methods
    abstract static class Shape {
        // Abstract method (no implementation)
        abstract void draw();

        // Concrete method
        void display() {
            System.out.println("Displaying shape details");
        }
    }

    // Concrete subclass of Shape
    static class Circle extends Shape {
        private double radius;

        // Constructor
        Circle(double radius) {
            this.radius = radius;
        }

        // Implementing the abstract method
        @Override
        void draw() {
            System.out.println("Drawing a circle with radius: " + radius);
        }
    }

    // Another subclass of Shape
    static class Rectangle extends Shape {
        private double length, width;

        // Constructor
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Implementing the abstract method
        @Override
        void draw() {
            System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
        }
    }

    // Abstract class with abstract method
    abstract static class Animal {
        abstract void makeSound(); // Abstract method

        // Concrete method
        void sleep() {
            System.out.println("This animal is sleeping...");
        }
    }

    // Concrete subclass of Animal
    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog says: Bark bark!");
        }
    }

    // Another subclass of Animal
    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat says: Meow!");
        }
    }

    public static void main(String[] args) {
        // Demonstrating abstract class Shape
        System.out.println("**Abstract Class Shape Example**");
        Shape circle = new Circle(5.5);
        circle.draw(); // Calls Circle's draw method
        circle.display(); // Calls Shape's display method

        Shape rectangle = new Rectangle(10, 4);
        rectangle.draw(); // Calls Rectangle's draw method
        rectangle.display(); // Calls Shape's display method

        // Demonstrating abstract class Animal
        System.out.println("\n**Abstract Class Animal Example**");
        Animal dog = new Dog();
        dog.makeSound(); // Calls Dog's makeSound method
        dog.sleep(); // Calls Animal's concrete sleep method

        Animal cat = new Cat();
        cat.makeSound(); // Calls Cat's makeSound method
        cat.sleep(); // Calls Animal's concrete sleep method
    }
}