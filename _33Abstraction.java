// Example to create abstract class.
public abstract class _33Abstraction {

    // Abstraction is a method og=f hiding certain details of the program,
    // And showing only essantial part to the user.
    // abstract keyword is used to achieve abstraction, it is non access modifier,
    // And by interface also we can achieve abstraction will study it later.

    // There are either abstract class or abstract method.
    // Abstract class - is a restricted class that cannot be used to create objects,
    // (to access it, it must be inherited from another class).

    // Abstract method - can only be used in an abstract class,
    // and it does not have a body. The body is provided by the subclass (inherited from).
    
    // This class is abstract class.

    // This is abstract method whose body will be provided later.
    public abstract void Greetings();

    // We can also have non abstract methods here.
    public void name() {
        System.out.println("Bye");
    }
}
