public class BitwiseOperators {
    public static void main(String[] args) {
        // 1. Bitwise AND (&)
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = a & b; // 0001 in binary (1 in decimal)
        System.out.println("a & b: " + result); // Output: a & b: 1

        // 2. Bitwise OR (|)
        result = a | b; // 0111 in binary (7 in decimal)
        System.out.println("a | b: " + result); // Output: a | b: 7

        // 3. Bitwise XOR (^)
        result = a ^ b; // 0110 in binary (6 in decimal)
        System.out.println("a ^ b: " + result); // Output: a ^ b: 6

        // 4. Bitwise Complement (~)
        result = ~a; // 1010 in binary (in 32-bit, it's 11111111111111111111111111111010, -6 in decimal)
        System.out.println("~a: " + result); // Output: ~a: -6

        // 5. Left Shift (<<)
        result = a << 1; // 1010 in binary (10 in decimal)
        System.out.println("a << 1: " + result); // Output: a << 1: 10

        // 6. Right Shift (>>)
        result = a >> 1; // 0010 in binary (2 in decimal)
        System.out.println("a >> 1: " + result); // Output: a >> 1: 2

        // 7. Unsigned Right Shift (>>>)
        a = -5; // 11111111111111111111111111111011 in binary (two's complement representation)
        result = a >>> 1; // 01111111111111111111111111111101 in binary (2147483645 in decimal)
        System.out.println("a >>> 1: " + result); // Output: a >>> 1: 2147483645
    }
}
