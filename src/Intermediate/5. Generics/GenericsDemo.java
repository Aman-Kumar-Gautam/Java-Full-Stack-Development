import java.util.ArrayList;
import java.util.List;

public class GenericsDemo{

    // Generic Class Example
    public static class Box<T> {
        private T content;

        public void setContent(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public static void main(String[] args) {
            // Create a Box for String
            Box<String> stringBox = new Box<>();
            stringBox.setContent("Hello, Generics!");
            System.out.println("String content: " + stringBox.getContent());

            // Create a Box for Integer
            Box<Integer> integerBox = new Box<>();
            integerBox.setContent(123);
            System.out.println("Integer content: " + integerBox.getContent());
        }
    }

    // Generic Method Example
    public static class GenericMethodExample {
        // Generic method to print elements of an array
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] stringArray = {"Hello", "Generics", "World"};

            System.out.println("Integer Array:");
            printArray(intArray);

            System.out.println("String Array:");
            printArray(stringArray);
        }
    }

    // Upper Bounded Type Parameter Example
    public static class UpperBoundedExample {
        // Generic method with an upper bounded type parameter
        public static <T extends Number> void printNumber(T number) {
            System.out.println("Number: " + number);
        }

        public static void main(String[] args) {
            printNumber(10); // Integer
            printNumber(3.14); // Double
        }
    }

    // Lower Bounded Type Parameter Example
    public static class LowerBoundedExample {
        // Generic method with a lower bounded type parameter
        public static void addNumbers(List<? super Integer> list) {
            list.add(1);
            list.add(2);
            list.add(3);
        }

        public static void main(String[] args) {
            List<Number> numberList = new ArrayList<>();
            addNumbers(numberList);
            System.out.println("Number List: " + numberList);
        }
    }

    // Unbounded Wildcard Example
    public static class UnboundedWildcardExample {
        // Method with unbounded wildcard
        public static void printList(List<?> list) {
            for (Object element : list) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");

            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);

            printList(stringList);
            printList(intList);
        }
    }

    // Upper Bounded Wildcard Example
    public static class UpperBoundedWildcardExample {
        // Method with upper bounded wildcard
        public static void printNumbers(List<? extends Number> list) {
            for (Number number : list) {
                System.out.println(number);
            }
        }

        public static void main(String[] args) {
            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);

            List<Double> doubleList = new ArrayList<>();
            doubleList.add(3.14);
            doubleList.add(1.618);

            printNumbers(intList);
            printNumbers(doubleList);
        }
    }

    // Lower Bounded Wildcard Example
    public static class LowerBoundedWildcardExample {
        // Method with lower bounded wildcard
        public static void addNumbers(List<? super Integer> list) {
            list.add(1);
            list.add(2);
            list.add(3);
        }

        public static void main(String[] args) {
            List<Number> numberList = new ArrayList<>();
            addNumbers(numberList);
            System.out.println("Number List: " + numberList);
        }
    }

    // Summary:
    // Generics provide type safety, eliminate the need for casts, and enable code reusability.
    // They also improve readability and make code easier to maintain.
}
/*Key Concepts Covered:
Generic Classes:

The Box<T> class is a generic class that can hold any type, specified when the object is created.
Example: Box<String> stringBox = new Box<>();.
Generic Methods:

The printArray(T[]) method is a generic method that can print any array type, specified at the method call.
Example: printArray(intArray);.
Bounded Type Parameters:

Upper Bound: T extends Number ensures that the type is a subclass of Number.
Lower Bound: List<? super Integer> ensures that the list can be of Integer or a superclass of Integer.
Wildcards:

Unbounded Wildcard: List<?> can accept lists of any type.
Upper Bounded Wildcard: List<? extends Number> accepts lists of types that extend Number.
Lower Bounded Wildcard: List<? super Integer> accepts lists of types that are superclasses of Integer.
This code demonstrates how generics help in writing flexible, reusable, and type-safe code in Java, eliminating the need for type casting and enhancing code readability. */