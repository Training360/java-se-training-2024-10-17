package training.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesMain {

    public static void main(String[] args) {
        var date = LocalDate.now();
        System.out.println(date);

        var time = LocalTime.now();
        System.out.println(time);

        var dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        var dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTime.format(dateTimeFormat));

        System.out.println(dateTimeFormat.format(LocalDateTime.now()));

        System.out.println(LocalDate.of(2024, 9, 12));


        var zoned = ZonedDateTime.now();
        System.out.println(zoned);

        var zone = ZoneId.systemDefault();
        System.out.println(zone);

    }
}
