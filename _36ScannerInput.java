// Scanner class is used from the package java.util
// To use scanner class we have to create an object of the scanner class first.
// Like this we can import scanner class package.
import java.util.Scanner;

public class _36ScannerInput {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");

        // To get input we have to mention the input type first
        // See exmaple below
        String name = s.nextLine();
        System.out.println("My name is "+name);

        /*
        Like these there are many input types that scanner can except.
        Method	        Description
        nextBoolean()	Reads a boolean value from the user
        nextByte()	    Reads a byte value from the user
        nextDouble()	Reads a double value from the user
        nextFloat()	    Reads a float value from the user
        nextInt()	    Reads a int value from the user
        nextLine()	    Reads a String value from the user
        nextLong()	    Reads a long value from the user
        nextShort()	    Reads a short value from the user
        */

        //Eg.
        System.out.println("Enter Age");
        int age = s.nextInt();
        System.out.println("Age is: " + age);

        // Note: If you enter wrong input (e.g. text in a numerical input), 
        // you will get an exception/error message (like "InputMismatchException").
    }
}
