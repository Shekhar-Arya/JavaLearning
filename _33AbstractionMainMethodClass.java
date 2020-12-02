public class _33AbstractionMainMethodClass extends _33Abstraction{

    // Here we will provide a body of the Greetings method.
    //@Override
    public void Greetings() {
      System.out.println("Hello! Hi");  
    }

    public static void main(String[] args) {
        _33AbstractionMainMethodClass obj = new _33AbstractionMainMethodClass();
        // If you try to make object of the abstract class than it will genrate an error, we can only inherit the class.
        obj.Greetings();
        obj.name();
    }
    
}
