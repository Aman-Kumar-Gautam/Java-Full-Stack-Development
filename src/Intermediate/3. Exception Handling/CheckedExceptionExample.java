import java.io.*;

// Example demonstrating Checked Exceptions
public class CheckedExceptionExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating Checked Exceptions\n");

        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // Method demonstrating Checked Exception
    public static void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
        BufferedReader reader = new BufferedReader(file);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}