import java.io.*;
public class _48CreatingFile {
    public static void main(String[] args) {
        File obj = new File("MyFile.txt");
        // To create a file we have to use createNewFile() and it will return true or false.
        // True if file is created or false if file already exits.
        // we have to use this method in try/catch block becuase it will throws and expression,
        // if file alraedy exist.
        try {
            if(obj.createNewFile())
            {
                // THis is ow file will be created.
                System.out.println("File craeted of name: "+obj.getName());
            }
            else
            {
                System.out.println("File already exst of name: "+obj.getName());
            }
        } catch (Exception e) {
            System.out.println("An Error Occured.");
        }

        // To write a file we will use Filewriter as below:
        try {
            FileWriter w = new FileWriter("MyFile.txt");
            w.write("Hello How are You!\n What do you do?");
            w.close();
            System.out.println("File SuccessFully created");
        } catch (Exception e) {
            System.out.println("An error occured in creating file");
        }
        
    }
}
