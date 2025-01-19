class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the Parent constructor
        System.out.println("Child constructor");
    }
    void display() {
        super.display(); // Calls the Parent method
        System.out.println("Child method");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}