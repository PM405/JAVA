package princemishra;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarDisplay {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter year (e.g. 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Header
        LocalDate firstDay = LocalDate.of(year, month, 1);
        String monthName = firstDay.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int lengthOfMonth = firstDay.lengthOfMonth();
        int startDay = firstDay.getDayOfWeek().getValue(); // 1 = Monday, 7 = Sunday

        System.out.println("\n     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Adjusting start position
        int dayCounter = 1;
        int currentWeekDay = startDay % 7; // Making Sunday=0
        for (int i = 0; i < currentWeekDay; i++) {
            System.out.print("   ");
        }

        // Print all days
        for (int i = currentWeekDay; i < 7; i++) {
            System.out.printf("%2d ", dayCounter++);
        }
        System.out.println();

        while (dayCounter <= lengthOfMonth) {
            for (int i = 0; i < 7 && dayCounter <= lengthOfMonth; i++) {
                System.out.printf("%2d ", dayCounter++);
            }
            System.out.println();
        }

        scanner.close();
    }



}
