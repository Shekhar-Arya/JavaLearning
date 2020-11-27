public class _18MethodOverloading {
    
    // Method Overloading is a situation where two or more function have same name but,
    // different signature.
    // Signature as data type of parameters passed in functoin
    // Eg.

    public static void Method()
    {
        System.out.println("No. 1");
    }
    public static void Method(int x) {
        System.out.println(x);
    }
    public static void Method(String y) {
        System.out.println(y);
    }
    public static void Method(int x, int y) {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        
        // Here we call all the methods.
        // As we see we have same name of method but with different signature,
        // This is known as Method Overloading.

        Method();
        Method(10);
        Method("Hello");
        Method(10, 20);
        // Multiple methods can have the same name as long as the number and/or type of parameters are different.
        
    }
    
}
