import java.util.Arrays;

public class singleArray {
    public static void main(String[] args) {

        // 1. Declaration and Initialization
        int[] numbers = {1, 2, 3, 4, 5}; // Together
        int[] otherNumbers; // Separate
        otherNumbers = new int[]{10, 20, 30, 40, 50};

        System.out.println("Declared and initialized arrays:");
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("otherNumbers: " + Arrays.toString(otherNumbers));

        // 2. Accessing Elements
        System.out.println("\nAccessing specific elements:");
        System.out.println("First element of numbers: " + numbers[0]);
        System.out.println("Third element of numbers: " + numbers[2]);

        // 3. Modifying Elements
        System.out.println("\nModifying elements:");
        numbers[1] = 10; // Modify second element
        numbers[3] = 8;  // Modify fourth element
        System.out.println("Modified numbers array: " + Arrays.toString(numbers));

        // 4. Iterating Through Arrays
        System.out.println("\nIterating through the array using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nIterating through the array using an enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        // 5. Array Length
        System.out.println("\nLength of the numbers array: " + numbers.length);

        // 6. Searching in Arrays
        System.out.println("\nSearching for an element in the array:");
        int searchElement = 3;
        boolean found = false;
        for (int number : numbers) {
            if (number == searchElement) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        // 7. Sorting Arrays
        System.out.println("\nSorting the array:");
        int[] unsortedNumbers = {5, 2, 8, 1, 3};
        Arrays.sort(unsortedNumbers);
        System.out.println("Sorted array: " + Arrays.toString(unsortedNumbers));

        // 8. Concatenating Arrays
        System.out.println("\nConcatenating two arrays:");
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};
        int[] combined = new int[numbers1.length + numbers2.length];
        System.arraycopy(numbers1, 0, combined, 0, numbers1.length);
        System.arraycopy(numbers2, 0, combined, numbers1.length, numbers2.length);
        System.out.println("Combined array: " + Arrays.toString(combined));

        // 9. Resizing Arrays
        System.out.println("\nResizing an array:");
        int[] oldArray = {1, 2, 3};
        int newSize = 5;
        int[] newArray = new int[newSize];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        System.out.println("Resized array: " + Arrays.toString(newArray));

        // 10. Other Operations
        System.out.println("\nOther operations:");

        // Copying Arrays
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Comparing Arrays
        boolean areEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are numbers and copiedArray equal? " + areEqual);

        // Filling Arrays
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        System.out.println("\nSingle-dimensional array operations complete!");
    }
}
