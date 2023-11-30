import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClass {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formatedTime = localTime.format(dateTimeFormatter);
        System.out.println("Current Time : "+formatedTime);
    }
}
