// First interface
interface Animal {
    void eat(); // Abstract method
}

// Second interface
interface Bird {
    void fly(); // Abstract method
}

// A class implementing multiple interfaces
class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    @Override
    public void fly() {
        System.out.println("Bat flies using its wings.");
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bat myBat = new Bat();
        myBat.eat(); // Output: Bat eats insects.
        myBat.fly(); // Output: Bat flies using its wings.
    }
}
