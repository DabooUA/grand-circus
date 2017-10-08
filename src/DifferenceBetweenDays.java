import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class DifferenceBetweenDays {
	public static void main(String[] args) {

		
		// This program compares two dates.
		
				System.out.print("Enter the newest date in YYYY-MM-DD format: ");

				Scanner scnr = new Scanner(System.in);
				
				String newestDateString = scnr.nextLine();
				
				LocalDate newestDate = LocalDate.parse(newestDateString);
				
				
				System.out.print("Enter the oldest date in YYYY-MM-DD format: ");

				String oldestDateString = scnr.nextLine();

				LocalDate oldestDate = LocalDate.parse(oldestDateString);		

				Period difference = oldestDate.until(newestDate);


		int days = difference.getDays();
		int months = difference.getMonths();
		int years = difference.getYears();
		scnr.close();

		System.out.println("Your time difference is: " + years + " Years, " + months + " Months, and " + days + " Days.");

	}

}
























