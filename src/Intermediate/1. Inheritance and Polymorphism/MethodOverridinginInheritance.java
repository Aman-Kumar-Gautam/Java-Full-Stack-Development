// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the method of Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridinginInheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Output: Animal makes a sound

        Animal myCat = new Cat();
        myCat.sound(); // Output: Cat meows
    }
}