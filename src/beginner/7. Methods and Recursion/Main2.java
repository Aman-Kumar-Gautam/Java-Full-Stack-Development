// Main class to demonstrate overloading in the Robot Command Center
public class Main2 {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // Command the robot to move
        robot.command("forward", 10);

        // Command the robot to pick up an object
        robot.command("box");

        // Command the robot to stand by
        robot.command();

        // Command the robot to perform multiple actions
        String[] actions = {"scan the area", "lift the box", "place the box on the shelf"};
        robot.command(actions);

        // Command the robot to speak a message
        robot.command("Hello, I am your assistant robot.", true);
    }
}