import java.util.Arrays;

public class multiDimentional {
    public static void main(String[] args) {
        // 1. Declaration and Initialization Together
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing Elements
        System.out.println("First element: " + matrix[0][0]); // Output: 1
        System.out.println("Third element in second row: " + matrix[1][2]); // Output: 6

        // Iterating Through Multi-dimensional Arrays Using Nested Loops
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Array Length
        System.out.println("Number of rows: " + matrix.length); // Output: 3
        System.out.println("Number of columns in first row: " + matrix[0].length); // Output: 3

        // Jagged Arrays
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }

        // Transposing a Matrix
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
