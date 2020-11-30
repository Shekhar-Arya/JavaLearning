public class _24StaticNonStatic {
    
    // As we Know we have built methods before,
    // But the methods were of static type
    // Static method or variable means that we can only use that function in
    // main method directly without making the object of the class.

    // And Non static means we can use the method or variable by creating object only.

    // Example of static method and variable.
    static int x = 10;
    static void StaticMethod()
    {
        System.out.println("This is Static Method");
    }

    // Example of non Static method or variable.
    int y = 20;
    public void NonStaticMethod() {
        System.out.println("This is non-static method");
    }

    // This is main method.
    public static void main(String[] args) {
        
        // As you see now we can use the static method directly without creating object as below:
        System.out.println(x);
        StaticMethod();

        // And below is the example of non static which can only be used,
        // by making object of the class.
        _24StaticNonStatic obj = new _24StaticNonStatic();
        System.out.println(obj.y);
        obj.NonStaticMethod();

        // We can also use different class by creating its objects and their methods and variables too. 
    }

}
