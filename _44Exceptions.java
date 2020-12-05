// While running the program there are many way and chances that an error will occured,
// like by user enetring wrong input type and etc.
// This in technical term we will say java will throw an exception.

public class _44Exceptions {

    public void CheckAge(int age) {
        if (age<18) {
            // throw key word is used to craete an custom error.
            // throw is used withthe exception type.
            // there are amny exception type one of its is ArthematicException used beow:
            throw new ArithmeticException("Access Denied: Age is too low");
            
        }
        else{
            System.out.println("Access Granted: Age is not an issue");
        }
    }

    // Now we will see an example of the throws keyword.
    public void name(String name) throws Exception {
        if (name == "Shekhar") {
            System.out.println("Access granted");
        }
        else{
            throw new Exception("This is wrong ");
        }
    }

    // here we will have our own class exception see below:
    public void surname(String surname) throws _44MyOwnException {
        if (surname!="Arya") {
            throw new _44MyOwnException("This is not correction surname");
        }
        else{
            System.out.println("This is correct surname");
        }
    }

    public static void main(String[] args) {
        
        // try and catch
        // try statemant allows you to define a block of code that will chek if there is any error,
        // in that block of code.

        // catch statment allows you to define a block of code that will run if there are any error in the try block of code;

        // try catch keyword comes in pair;
        // Syntax
        /*
        try{
            block of code for try;
        }
        catch(Exception e){
            block of code for catch;
        }
        */

        // These will work like try will run a block of code if there is exception then,
        // try block will throws an exception and that exception will be catched be catch block of code,
        // then it will run catch part.

        // Eg
        try {
            int[] myArray = {1,2,3};
            System.out.println(myArray[4]); // these will throws an Exception because there id value at index 4;
        } catch (Exception e) {
            System.out.println("No value at index 4");
        }

        // finally keyword is used to craete a block of code that will print,
        // after try_catch block of code regardless of the result.

        finally{
            System.out.println("This is finally block of code.");
        }

        // for throw see above method.
        _44Exceptions e = new _44Exceptions();
        //e.CheckAge(10);
        e.CheckAge(20);
        
        // this is try of the throws
        try {
            e.name("Arya");
        } catch (Exception ex) {
            System.out.println("Caught name exception in main function: "+ex);
        }

        try {
            e.surname("Hi");
        } catch (Exception exception) {
            System.out.println("Surname wrong: "+exception);
        }

    }
}
