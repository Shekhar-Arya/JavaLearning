public class _16Methods {
    
    // Methods are the block of code which we defines once and can be used many times.
    // Methods run when only it is called.
    // Eg. to define methods.
    
    static void myMethod()
    {
        System.out.println("Hi");
    }
    // myMethod is Name of the method
    // static means it used in main class only and not in object of the main class.
    // void means methods have no return type.

    public static void main(String[] args) {
        
        // This is how we call the method for use.
        myMethod();

        // How many times we call the method that many times the method will be run.
        myMethod();
        myMethod();
    }
}
