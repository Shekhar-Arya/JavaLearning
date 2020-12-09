import java.util.Scanner;
import java.io.*;

public class _48ReadFiles {
    public static void main(String[] args) {

        // to read a file we will use Scanner
        File obj = new File("MyFile.txt");
        try {
            Scanner s = new Scanner(obj);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                System.out.println(data);
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occured while reading");
            e.printStackTrace();
        }

        // Getting file information.
        if(obj.exists())
        {
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.canWrite());
            System.out.println(obj.canRead());
            System.out.println(obj.length());
        }
        else{
            System.out.println("File does not exist");
        }

        /*
        Note: There are many available classes in the Java API that can be used to read and write files in Java: FileReader, 
        BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc. 
        Which one to use depends on the 
        Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc.
        */
    }
}
