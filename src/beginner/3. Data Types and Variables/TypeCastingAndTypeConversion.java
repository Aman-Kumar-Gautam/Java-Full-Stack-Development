public class TypeCastingAndTypeConversion {
    public static void main(String[] args) {
        int a = 100;
        float b = 1000.5f;

        // 1. Widening or Implicit Casting

        double c = a;
        System.out.println(c);


        // 2. Narrowing or Explicit Casting

        int d = (int) b;
        System.out.println(d);
    }
}
