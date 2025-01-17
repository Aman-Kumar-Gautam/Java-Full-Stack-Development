// Method Overriding Example: Animal Kingdom

// Base class: Animal
class Animal {
    // Method to describe the sound of the animal
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }

    // Method to describe how the animal moves
    public void move() {
        System.out.println("This animal moves in some way.");
    }
}

// Derived class: Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }

    @Override
    public void move() {
        System.out.println("The dog runs on four legs.");
    }
}

// Derived class: Bird
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps: Tweet Tweet!");
    }

    @Override
    public void move() {
        System.out.println("The bird flies gracefully in the sky.");
    }
}

// Derived class: Fish
class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The fish remains mostly silent.");
    }

    @Override
    public void move() {
        System.out.println("The fish swims smoothly in the water.");
    }
}
