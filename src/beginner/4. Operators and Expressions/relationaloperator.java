public class relationaloperator {
    public static void main(String[] args) {
        System.out.println("2. Relational Operator");
        /*
         * 1. Equal to ('==')
         * 2. Not equal to ('!=')
         * 3. Greater than ('>')
         * 4. Less than ('<')
         * 5. Greater than or equal to ('>')
         * 6. Less than or equal to ('<=')
         */
        int A = 10; int C = 20;
        System.out.println();
        System.out.println("1. Equal to ('==')");
        boolean p = A == C;
        System.out.println("A = 10 == C = 20 == "+p);
        System.out.println();
        System.out.println("2. Not equal to ('!=')");
        boolean q = C != A;
        System.out.println("A = 10 != C = 20 == "+q);
        System.out.println();
        System.out.println("3. Greater than ('>')");
        boolean r = A > C;
        System.out.println("A = 10 > C = 20 == "+r);
        System.out.println();
        System.out.println("4. Less than ('<')");
        boolean s =A < C;
        System.out.println("A = 10 < C = 20== "+s);
        System.out.println();
        System.out.println("5. Greater than or equal to ('>')");
        boolean t = A >= C;
        System.out.println(" A = 10 >= C = 20 == "+t);
        System.out.println();
        System.out.println("6. Less than or equal to ('<=')");
        boolean u = A <= C;
        System.out.println("C = 20 <= A = 10  == "+u);
        System.out.println();
    }
}
