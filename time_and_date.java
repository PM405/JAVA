package princemishra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class time_and_date {

	public static void main(String[] args) {
		
		 LocalDateTime now = LocalDateTime.now();

	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        String formattedDateTime = now.format(formatter);

	        
	        System.out.println("Current Date and Time: " + formattedDateTime);
	    }
	

}
