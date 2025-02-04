import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Ensure the file exists before running

        System.out.println("Reading file line by line:");
        readFileLineByLine(filePath);

        System.out.println("\nReading file using a character array:");
        readFileUsingCharArray(filePath);

        System.out.println("\nReading file character by character:");
        readFileCharacterByCharacter(filePath);
    }

    // Method 1: Reading file line by line (Most efficient)
    public static void readFileLineByLine(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method 2: Reading file using a character array
    public static void readFileUsingCharArray(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            char[] buffer = new char[1024]; // Read 1 KB at a time
            int bytesRead;
            while ((bytesRead = bufferedReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method 3: Reading file character by character
    public static void readFileCharacterByCharacter(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
