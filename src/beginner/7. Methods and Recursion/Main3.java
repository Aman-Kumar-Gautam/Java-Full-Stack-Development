// Main class to demonstrate method overriding
public class Main3 {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = {new Dog(), new Bird(), new Fish()};

        // Loop through the animals and call their methods
        for (Animal animal : animals) {
            System.out.println("-----");
            animal.makeSound();
            animal.move();
        }
    }
}