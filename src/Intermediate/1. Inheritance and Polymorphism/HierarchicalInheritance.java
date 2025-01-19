// Superclass
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Subclass 1 inheriting from Shape
class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: πr²");
    }
}

// Subclass 2 inheriting from Shape
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle: l × w");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw(); // Inherited from Shape
        myCircle.area();

        Rectangle myRectangle = new Rectangle();
        myRectangle.draw(); // Inherited from Shape
        myRectangle.area();
    }
}