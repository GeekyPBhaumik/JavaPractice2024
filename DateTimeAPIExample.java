import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime modifiedCurrentDateTime = currentDateTime.plusHours(2);
        System.out.println(currentDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = currentDateTime.format(formatter);
        String modifiedTime = modifiedCurrentDateTime.format(formatter);
        System.out.println(dateTime);
        System.out.println(modifiedTime);
    }
}
