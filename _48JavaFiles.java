// java package for file hande=leing is below:
import java.io.*;

public class _48JavaFiles {
    public static void main(String[] args) {
         // to use the file class we have to craete an object of that class.
         // Specify the file name or the path while creating object.
         File obj = new File("myFile.txt");

         /*
         The File class has many useful methods for creating and getting information about files. For example:

Method	            Type	        Description
canRead()	        Boolean         Tests whether the file is readable or not
canWrite()	        Boolean	        Tests whether the file is writable or not
createNewFile()	    Boolean	        Creates an empty file
delete()	        Boolean	        Deletes a file
exists()	        Boolean	        Tests whether the file exists
getName()	        String	        Returns the name of the file
getAbsolutePath()	String	        Returns the absolute pathname of the file
length()	        Long	        Returns the size of the file in bytes
list()	            String[]	    Returns an array of the files in the directory
mkdir()	            Boolean	        Creates a directory
         */

        System.out.println(obj.exists());
    }
}
