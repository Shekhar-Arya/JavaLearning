
// Enum is a special type of the class that contains constants (Unchangable variable, like final variable).
// To create enum use "enum" keyword. And the constant variable are named in capital letters seprated by comma.
// Enum is short for "enumerations", which means "specifically listed".


public class _35Enums {
    
// Eg to create enum
enum Level
{
    LOW,
    MEDIUM,
    HIGH
}
    public static void main(String[] args) {
    // We can access enum constants with dot "." syntax.
    // Example to access enum constant variable.
    Level myLeval = Level.LOW;
    System.out.println(myLeval);

    // We can also use enum variable in switch statement or at else place.
    switch (myLeval) {
        case LOW:
            System.out.println("Low Level");
            break;
        
        case MEDIUM:
            System.out.println("Medium level");
            break;
        case HIGH:
            System.out.println("High level");
            break;    
        default:
            System.out.println("No Level");
            break;
    }

    // We can loop through the enum by for each loop
    // Here .values() method will return the array of the enum constants
    for (Level level : Level.values()) {
        System.out.println(level);
    }

    /*
    Difference between Enums and Classes
    An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public,
    static and final (unchangeable - cannot be overridden).

    An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

    Why And When To Use Enums?
    Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
    */

    }
}
