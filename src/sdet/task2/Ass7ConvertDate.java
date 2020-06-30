package sdet.task2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ass7ConvertDate {

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String stringdate = "2020-06-24";
        LocalDate date = LocalDate.parse(stringdate, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}