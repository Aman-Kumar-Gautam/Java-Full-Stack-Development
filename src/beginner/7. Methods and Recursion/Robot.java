// Method Overloading Example: Robot Command Center

public class Robot {

    // Method to make the robot move a certain distance
    public void command(String direction, int distance) {
        System.out.println("Robot is moving " + distance + " meters " + direction + ".");
    }

    // Overloaded method to make the robot pick up an object
    public void command(String object) {
        System.out.println("Robot is picking up a " + object + ".");
    }

    // Overloaded method to make the robot perform an action without parameters
    public void command() {
        System.out.println("Robot is standing by, awaiting further instructions.");
    }

    // Overloaded method to make the robot perform multiple actions
    public void command(String[] actions) {
        System.out.println("Robot is performing the following actions:");
        for (String action : actions) {
            System.out.println("- " + action);
        }
    }

    // Overloaded method to make the robot speak
    public void command(String message, boolean speak) {
        if (speak) {
            System.out.println("Robot says: \"" + message + "\"");
        } else {
            System.out.println("Robot silently processes: \"" + message + "\"");
        }
    }
}


