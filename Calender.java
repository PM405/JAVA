package princemishra;
import java.util.*;
public class Calender {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();

        // Extracting details
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; 
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Display the calendar format
        System.out.println("📅 Current Date and Time:");
        System.out.println("Year  : " + year);
        System.out.println("Month : " + month);
        System.out.println("Day   : " + day);
        System.out.println("Time  : " + hour + ":" + minute + ":" + second);
    }
	

}
