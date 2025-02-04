import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    // Generic class example
    public static class Box<T> {
        private T content;

        public void setContent(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public static void main(String[] args) {
            Box<String> stringBox = new Box<>();
            stringBox.setContent("Hello, Generics!");
            System.out.println("String content: " + stringBox.getContent());

            Box<Integer> integerBox = new Box<>();
            integerBox.setContent(123);
            System.out.println("Integer content: " + integerBox.getContent());
        }
    }

    // Generic method example
    public static class GenericMethodExample {
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

    // Upper Bounded Type Parameter
    public static class UpperBoundedExample {
        public static <T extends Number> void printNumber(T number) {
            System.out.println("Number: " + number);
        }

        public static void main(String[] args) {
            printNumber(10); // Integer
            printNumber(3.14); // Double
        }
    }

    // Lower Bounded Type Parameter
    public static class LowerBoundedExample {
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
        public static void addNumbers(List<? super Integer> list) {
            list.add(1);
            list.add(2);
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
/*
Explanation:
Generic Class (Box<T>): This demonstrates a class that can hold any type T, and the type is specified at the time of instantiation.
Generic Method (printArray(T[])): A method that can print elements of any array type, specified at the time of the method call.
Upper Bounded Type Parameter: Restricts the type to subclasses of Number.
Lower Bounded Type Parameter: Accepts lists that are either Integer or a superclass of Integer.
Wildcards:
Unbounded Wildcard: Can accept lists of any type.
Upper Bounded Wildcard: Restricts to types that extend Number.
Lower Bounded Wildcard: Restricts to types that are superclasses of Integer.
This file illustrates the core concepts of generics in Java, showing how they improve code flexibility, type safety, and readability. */