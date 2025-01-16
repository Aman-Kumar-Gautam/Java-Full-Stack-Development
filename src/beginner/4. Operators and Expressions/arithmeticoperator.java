public class arithmeticoperator {
    public static void main(String[] args) {
        System.out.println("1. Arithmetic Operator");
    /*
     * 1. Addition (`+`)
     * 2. Subtraction ('-')
     * 3. Multiplication ('*')
     * 4. Division ('/')
     * 5. Modulus ('%')
     * 6. Unary Plus (`+`)
     * 7. Unary minus (`+`)
     * 8. Increment ('++')
     * 9. Decrement ('--')
     */
        int A = 10; int C = 20;
        
        System.out.println("1. Addition (`+`) Operator");
        int p = A + C;
        System.out.println("A = 10 + C = 20 == "+p);
        System.out.println();
        System.out.println("2. Subtraction ('-')");
        int q = C - A;
        System.out.println("C = 20 - A = 10 == "+q);
        System.out.println();
        System.out.println("3. Multiplication ('*')");
        int r = A * C;
        System.out.println("A = 10 * C = 20 == "+r);
        System.out.println();
        System.out.println("4. Division ('/')");
        int s = C / A;
        System.out.println("C = 20 / A = 10 == "+s);
        System.out.println();
        System.out.println("5. Modulus ('%')");
        int t = A % C;
        System.out.println("C = 20 % A = 10  == "+t);
        System.out.println();
        
    }
}
