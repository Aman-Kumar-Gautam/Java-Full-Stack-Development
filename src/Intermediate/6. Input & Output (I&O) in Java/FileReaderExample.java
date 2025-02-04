import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Ensure the file exists before running

        System.out.println("Reading file character by character:");
        readFileCharacterByCharacter(filePath);

        System.out.println("\nReading file using a character array:");
        readFileUsingCharArray(filePath);

        System.out.println("\nReading file using BufferedReader:");
        readFileUsingBufferedReader(filePath);
    }

    // Method 1: Reading file character by character
    public static void readFileCharacterByCharacter(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method 2: Reading file using a character array
    public static void readFileUsingCharArray(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            char[] buffer = new char[1024]; // Read 1 KB at a time
            int bytesRead;
            while ((bytesRead = fileReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method 3: Using BufferedReader for efficient reading
    public static void readFileUsingBufferedReader(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
