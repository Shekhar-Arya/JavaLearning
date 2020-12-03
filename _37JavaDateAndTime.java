
// Java dont have any built in class for date time,
// but we can import from jaa.time package.
import java.time.*;
import java.time.format.DateTimeFormatter;

// There different class in java.time package that are used for different purpose
// As mentioned below:

/*
Class	            Description
LocalDate	        Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */

public class _37JavaDateAndTime {

    public static void main(String[] args) {
        
        // To display date of current place and current day we will use localDate class
        // As below:
        LocalDate ld = LocalDate.now();
        // This will display current date.
        System.out.println(ld);

        // To display current Time we will use LocalTime Class
        LocalTime lt = LocalTime.now();
        // This will display current time
        System.out.println(lt);

        // Display current date and time bot at once;
        LocalDateTime ldlt = LocalDateTime.now();
        // Display it down here.
        System.out.println(ldlt);

        // Formatting Date time as below:
        System.out.println("Before Formating: "+ ldlt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String AfterFormating = ldlt.format(dtf);
        System.out.println("Afetr Formating: "+AfterFormating);

        /*
        The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. 
        //For example:

        Value	        Example
        yyyy-MM-dd	    "1988-09-29"	
        dd/MM/yyyy	    "29/09/1988"	
        dd-MMM-yyyy	    "29-Sep-1988"	
        E, MMM dd yyyy	"Thu, Sep 29 1988"
        */
    }
    
}
