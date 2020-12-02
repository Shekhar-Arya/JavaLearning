//The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.
// To use a class or a package from the library, you need to use the import keyword

// Syntax is as follow
/*
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
 */

// Example of package only class.
import java.util.Scanner;

// Example of whole package
import java.util.*; 

public class _28Packages {
    
    // Scanner class is used to get the value from the user.
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        int x = s.nextInt();
        System.out.println(x);
    }
}
