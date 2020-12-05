// Wrapper class provide a way to use primitive data type(int, double, etc..) as object.
// Following are the wrapper classes of the primitive data type.
/*
Primitive Data Type	        Wrapper Class
byte	                    Byte
short	                    Short
int	                        Integer
long	                    Long
float	                    Float
double	                    Double
boolean	                    Boolean
char	                    Character
*/

// Sometimes we must use wrapper classes, like when we are working with the collection(ArrayList.., etc)
// ArryaList<int> x = new ArrayList<int>();  This is invalid
// ArryaList<Integer> x = new ArrayList<Integer>();  This is valid

// To create an wrapper object we will use wrapper class instead of the primitive data type.
// Eg as below

public class _43WrapperClass {
    public static void main(String[] args) {
        Integer myInt = 20;
        Double myDouble = 10.20;
        Character myChar = 'S';

        // To get the value we can just print the object;
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Now as we are working with the wrapper clss there are certain methodds that we can use,
        // Like to get the value associated with the corresponding wrapper object we will use following methods;
        // intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
        System.out.println(myChar.charValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myInt.intValue());

        // Now we will use toString() method to convert other wrapper class to string,
        // And then we will use length() method to find the length of that string.       
        String myString = myInt.toString();
        System.out.println(myString);
        System.out.println(myString.length());


    }
}
