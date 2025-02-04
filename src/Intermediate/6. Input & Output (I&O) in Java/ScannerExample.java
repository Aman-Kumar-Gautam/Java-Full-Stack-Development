import java.io.*;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Ensure the file exists before running

        System.out.println("Reading file line by line:");
        readFileLineByLine(filePath);

        System.out.println("\nReading file word by word:");
        readFileWordByWord(filePath);

        System.out.println("\nReading file character by character:");
        readFileCharacterByCharacter(filePath);
    }

    // Method 1: Reading file line by line
    public static void readFileLineByLine(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method 2: Reading file word by word
    public static void readFileWordByWord(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method 3: Reading file character by character
    public static void readFileCharacterByCharacter(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter(""); // Set delimiter to empty string to read characters
            while (scanner.hasNext()) {
                System.out.print(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
