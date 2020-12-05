// Regular expression is used to perform all types of text search and text replace operations.
// we dont have inbuilt regular exception but we can import it;
import java.util.regex.*;

/*
Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
*/


public class _45RegularExpression {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3School", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3SChool");
        boolean bool = matcher.find();
        if (bool) {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }

        // Here Pattern.compile will have the content or text that is need to be found.
        // pattern.matcher will check the content or text of the pattern is there in matcher.
        // if it is there then find() method will return the true or it will return false.

        /*
        Flags in the compile() method change how the search is performed. Here are a few of them:

        Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
        
        Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated
        as ordinary characters when performing a search.
        
        Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside
        of the English alphabet

        */
    }
}
