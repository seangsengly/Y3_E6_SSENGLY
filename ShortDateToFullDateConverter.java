import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ShortDateToFullDateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a short date
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.next();

        try {
            // Parse the short date string
            SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdfInput.parse(shortDate);

            // Extract year, month, and day
            SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
            SimpleDateFormat sdfMonth = new SimpleDateFormat("MMMM");
            SimpleDateFormat sdfDay = new SimpleDateFormat("d");

            String year = sdfYear.format(date);
            String month = sdfMonth.format(date);
            String day = sdfDay.format(date);

            // Display the full date representation
            System.out.println(month + " " + day + ", " + year);

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }
}
