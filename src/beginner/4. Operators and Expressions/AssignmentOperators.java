public class AssignmentOperators {
    public static void main(String[] args) {
        // 1. Basic Assignment (=)
        int a = 10; // Assigns 10 to variable a
        System.out.println("a (Basic Assignment): " + a); // Output: a: 10

        // 2. Addition Assignment (+=)
        a += 5; // Equivalent to a = a + 5
        System.out.println("a (Addition Assignment): " + a); // Output: a: 15

        // 3. Subtraction Assignment (-=)
        a -= 5; // Equivalent to a = a - 5
        System.out.println("a (Subtraction Assignment): " + a); // Output: a: 10

        // 4. Multiplication Assignment (*=)
        a *= 5; // Equivalent to a = a * 5
        System.out.println("a (Multiplication Assignment): " + a); // Output: a: 50

        // 5. Division Assignment (/=)
        a /= 5; // Equivalent to a = a / 5
        System.out.println("a (Division Assignment): " + a); // Output: a: 10

        // 6. Modulus Assignment (%=)
        a %= 3; // Equivalent to a = a % 3
        System.out.println("a (Modulus Assignment): " + a); // Output: a: 1

        // Resetting a for bitwise operations
        a = 10; // 1010 in binary

        // 7. Bitwise AND Assignment (&=)
        a &= 3; // 0011 in binary, equivalent to a = a & 3
        System.out.println("a (Bitwise AND Assignment): " + a); // Output: a: 2

        // Resetting a for next operation
        a = 10; // 1010 in binary

        // 8. Bitwise OR Assignment (|=)
        a |= 3; // 0011 in binary, equivalent to a = a | 3
        System.out.println("a (Bitwise OR Assignment): " + a); // Output: a: 11

        // Resetting a for next operation
        a = 10; // 1010 in binary

        // 9. Bitwise XOR Assignment (^=)
        a ^= 3; // 0011 in binary, equivalent to a = a ^ 3
        System.out.println("a (Bitwise XOR Assignment): " + a); // Output: a: 9

        // Resetting a for shift operations
        a = 10; // 1010 in binary

        // 10. Left Shift Assignment (<<=)
        a <<= 2; // Equivalent to a = a << 2
        System.out.println("a (Left Shift Assignment): " + a); // Output: a: 40

        // Resetting a for next operation
        a = 10; // 1010 in binary

        // 11. Right Shift Assignment (>>=)
        a >>= 2; // Equivalent to a = a >> 2
        System.out.println("a (Right Shift Assignment): " + a); // Output: a: 2

        // Resetting a for next operation
        a = -10; // 11111111111111111111111111110110 in binary (two's complement representation)

        // 12. Unsigned Right Shift Assignment (>>>=)
        a >>>= 2; // Equivalent to a = a >>> 2
        System.out.println("a (Unsigned Right Shift Assignment): " + a); // Output: a: 1073741821
    }
}
