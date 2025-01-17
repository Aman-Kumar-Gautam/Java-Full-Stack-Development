public class myArray {
    public static void main(String[] args) {

        // 1. Declaration and Initialization Together
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array declared and initialized together:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        // 2. Declaration and Initialization Separately
        int[] otherNumbers; // Declaration
        otherNumbers = new int[]{10, 20, 30, 40, 50}; // Initialization
        System.out.println("Array declared and initialized separately:");
        for (int number : otherNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        // 3. Accessing Array Elements
        System.out.println("Accessing specific array elements:");
        System.out.println("First element: " + numbers[0]); // Output: 1
        System.out.println("Third element: " + numbers[2]); // Output: 3

        // 4. Array Length
        System.out.println("\nLength of the 'numbers' array: " + numbers.length); // Output: 5

        // 5. Iterating Over Arrays
        System.out.println("\nIterating using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nIterating using an enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        // 6. Arrays of Other Data Types
        System.out.println("\nArray of Strings:");
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nArray of doubles:");
        double[] prices = {19.99, 49.99, 99.99};
        for (double price : prices) {
            System.out.println(price);
        }

        System.out.println("\nArray of characters:");
        char[] grades = {'A', 'B', 'C', 'D'};
        for (char grade : grades) {
            System.out.println(grade);
        }

        // 7. Array of Objects
        System.out.println("\nArray of custom objects (Person):");
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 28);

        for (Person person : people) {
            System.out.println(person);
        }

        // 8. Arrays Are Fixed in Size
        System.out.println("\nDemonstrating fixed size of arrays:");
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Attempting to add another element would result in a compilation error
        // numbers[5] = 6; // Uncommenting this line will cause an ArrayIndexOutOfBoundsException

        System.out.println("\n\nFor dynamic sizing, consider using ArrayList.");
    }
}

// Custom Person class for demonstrating array of objects
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + '}';
    }
}
