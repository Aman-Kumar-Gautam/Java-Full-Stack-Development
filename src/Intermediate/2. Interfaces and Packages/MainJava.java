// Interface 1
interface Walkable {
    void walk();
}

// Interface 2
interface Runnable {
    void run();
}

// Class implementing both interfaces
class Athlete implements Walkable, Runnable {
    @Override
    public void walk() {
        System.out.println("Athlete is walking");
    }

    @Override
    public void run() {
        System.out.println("Athlete is running");
    }
}

// Interface with default method
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting");
    }
}

// Another interface with default method
interface Machine {
    default void start() {
        System.out.println("Machine is starting");
    }
}

// Class implementing both interfaces
class Robot implements Vehicle, Machine {
    // Resolve conflict by overriding the default method
    @Override
    public void start() {
        System.out.println("Robot is starting its operation");
    }
}

public class MainJava {
    public static void main(String[] args) {
        // Demonstrating Athlete functionality
        Athlete athlete = new Athlete();
        athlete.walk(); // Output: Athlete is walking
        athlete.run(); // Output: Athlete is running

        // Demonstrating Robot functionality
        Robot robot = new Robot();
        robot.start(); // Output: Robot is starting its operation
    }
}