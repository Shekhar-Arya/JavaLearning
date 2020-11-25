/**
 * _4DataTypesAndVariables
 */
public class _4DataTypesAndVariables {

    public static void main(String[] args) {
        
        // Variables are the containers that is used to store the the data into it.
        // We can give any name to the variable.

        // Data types are the types of which variables can be define.
        // There are various Data types such as:
        /*
        Data Type	Size	Description
            byte	1 byte	Stores whole numbers from -128 to 127
            short	2 bytes	Stores whole numbers from -32,768 to 32,767
            int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
            boolean	1 bit	Stores true or false values
            char	2 bytes	Stores a single character/letter or ASCII values 
        */

        //Example to use data types and create a variable:
        String name = "Shekhar";
        int age = 20;
        double height = 5.9;
        boolean student = true;

        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
        System.out.println("My height is "+ height);
        System.out.println("I Am Student? "+ student);

        //Two types of the data type:
        // 1. Primitive data type    2. Non primitive data type
        // Eg. of Non-Primitive data type are String, arrays, classes, interfaces etc. 
    }
}