package DateTimeClassJava8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Java8DateTime {
    public static void main(String[] args) {
        //Calculate Age:
        //Write a program that takes a birth date as input and calculates the age of a person using the Java 8 Date Time API.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth date (yyyy-MM-dd):");
        String birthDateString = sc.next();
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(birthDateString);
        Period period = Period.between(birthDate,currentDate);
        System.out.println("Years Gap:"+period.getYears());


        //Day of Week:
        //Write a program that determines the day of the week for a given date using the Java 8 Date Time API.
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate.getDayOfWeek());


        //Find Leap Year:
        //Write a program to check if a given year is a leap year or not using the Java 8 Date Time API.
        String year = "2020-04-11";
        int currentYear = LocalDate.parse(year).getYear();
        System.out.println(currentYear);

        //Duration between Dates:
        //Write a program to calculate the duration in days, months, and years between two given dates using the Java 8 Date Time API.
        String date1="2020-02-12";
        String date2="2022-04-11";
        LocalDate dateOne = LocalDate.parse(date1);
        LocalDate dateTwo = LocalDate.parse(date2);
        Period gap = Period.between(dateOne,dateTwo);
        System.out.println("Gap of Days:"+gap.getDays());
        System.out.println("Gap of Years:"+gap.getYears());
        System.out.println("Gap of Months:"+gap.getMonths());

        //Next Working Day:
        //Write a program that finds the next working day (excluding weekends) from a given date using the Java 8 Date Time API.
        String currWorkDate = "2024-04-20";
        LocalDate nextWorkingDate = null;
        LocalDate currLocalDate = LocalDate.parse(currWorkDate);
        if(currLocalDate.getDayOfWeek()==DayOfWeek.SATURDAY ||
           currLocalDate.getDayOfWeek()==DayOfWeek.SUNDAY){
            nextWorkingDate = currLocalDate.plusDays(1);
        }
        System.out.println("Next Working Date:"+nextWorkingDate);

        //Time Zone Conversion:
        //Write a program to convert a date-time value from one time zone to another using the Java 8 Date Time API.


        //Parsing and Formatting:
        //Write a program that demonstrates parsing a date-time string into a LocalDate or LocalDateTime object and then formatting it back to a different date-time format using DateTimeFormatter.
        String dateTimeString = "2024-08-12 22:09:09"; // Date and time string

        // Parse the date-time string into a LocalDateTime object
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // Format the LocalDateTime object using a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = formatter.format(localDateTime);

        System.out.println("Original Date-Time String: " + dateTimeString);
        System.out.println("Formatted Date-Time: " + formattedDateTime);
    }

}
