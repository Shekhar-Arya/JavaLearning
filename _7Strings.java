public class _7Strings {
    
    public static void main(String[] args) {
        
        // Strings are the collection of the characters surrounded by the double quote.
        // Eg. of creating varibale of type string.
        String greetings = "Hello there!";
        System.out.println(greetings);

        // variableName.length() function returns the length of the string.
        // Eg.
        System.out.println(greetings.length());

        // .toUppercase and .toLowerCase is used to convert whole string into upper or lower case.
        // Eg.
        System.out.println(greetings.toLowerCase());
        System.out.println(greetings.toUpperCase());

        // .indexOf function finds the index of the character or starting character of letter.
        // Eg.
        System.out.println(greetings.indexOf("H"));
        
        // String concatination .concate is used to concate two strings.
        // Eg.
        String name = "Shekhar".concat(greetings);
        System.out.println(name);

        // we cant add \ or "" or '' in string directly so for that we will use escape character "\".
        /*
        Escape      character	Result	Description
            \'	        '	    Single quote
            \"	        "	    Double quote
            \\	        \	    Backslash
        */

        //Eg.
        System.out.println("Hi there\'s my name \"Shekhar\"");

        // There are other escape character as Follow:
        /*
        Code	Result	
            \n	New Line	
            \r	Carriage Return	
            \t	Tab	
            \b	Backspace	
            \f	Form Feed
        */

        // If we add two numbers than program will sum up the numbers but,
        // if we add number and string than number will concate to the string.
        // Eg.
        int x = 10;
        int y = 10;
        String z = "10";
        System.out.println(x+y);
        System.out.println(x+z);
    }
}
