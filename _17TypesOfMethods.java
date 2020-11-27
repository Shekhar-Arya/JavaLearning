public class _17TypesOfMethods {
    
    // There are mainly four types of the methods.
    // 1. No parameter No return type
    // 2. With parameter No return type
    // 3. No parameter with return type
    // 4. with parameter with return type 

    // Eg for 1.
    static void Method1()
    {
        System.out.println("First Method Type");
    }

    // Eg for 2.
    public static void Method2(String name)
    {
        System.out.println(name);
    }

    // Eg for 3.
    public static String Method3() {
        return "Hola";
    }

    // Eg for 4.
    public static String Method4(String bye)
    {
        return bye;
    }

    public static void main(String[] args) {
        
        // Calling all methods here.
        Method1();
        Method2("Shekhar");

        // To get return type method we need variable to cacth the return value or directly print it.
        System.out.println(Method3());
        System.out.println(Method4("Bye"));

        // When a parameter is passed to the method, it is called an argument.
        // So, from the example above: name is a parameter, while Shekhar and Bye are arguments.
        
        // We can pass multiple arguments in the method by crating method of the multiple parameters.
        


    }
}
