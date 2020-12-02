public class _30InheritanceToThis extends _30Inheritance{
    public static void main(String[] args) {
        
        _30InheritanceToThis obj = new _30InheritanceToThis();
        // Like this we can use one class content to another.

        // name field is protected so we were able to access it.
        // If it was private than we would have not. 
        System.out.println("Car anem is "+ obj.name);
        obj.Move();

        /*
        Why And When To Use "Inheritance"?
        - It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

        Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.
        */
         

        // If class is created by using final keyword than we cant inherit it.
    }
}
