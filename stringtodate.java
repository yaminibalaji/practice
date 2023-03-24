import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class stringtodate {
	 public static LocalDate
	    DateFromString(String string,DateTimeFormatter format)
	    {
	        // Converting the string to date in the specified format
	        
	        LocalDate date = LocalDate.parse(string, format);
	        return date;
	    }

	public static void main(String[] args) throws Exception {
		 
        String st = "28 October 2018";
 
        // Getting the format by creating an object of DateTImeFormatter class
        
        DateTimeFormatter format
            = DateTimeFormatter.ofPattern("d MMMM yyyy");
        try {
 
            // Getting the Date from String
            LocalDate date
                = DateFromString(st, format);
            System.out.println(date);
        }
        // if the String pattern is invalid
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e);
        }
        // If the String was unable to be parsed
        catch (DateTimeParseException e) {
            System.out.println("Exception: " + e);}

}
}
