public class Variables {
    static int a = 100;
    int b = 101;
    public static void main(String[] args) {
        int c = 102;
        Variables d = new Variables();

        System.out.println("Local variable c= "+c);
        System.out.println("Instance variable b= "+d.b);
        System.out.println("Static variable a= "+Variables.a);
    }
}
/*
Note:   var variable: In version 10 and above it support and after wirting this no need to specific
data type.

example like:
var x = 10;
var y = 10.5;
var z = "Aman";  
*/