import java.io.*;
public class _48DeleteFiles {
    public static void main(String[] args) {
        
        // this program is used to delete the file
        File obj = new File("MyFile.txt");
        if(obj.delete())
        {
            System.out.println("File Succesfully deleted");
        }
        else
        {
            System.out.println("File is nor=t deleted");
        }
    }
}
