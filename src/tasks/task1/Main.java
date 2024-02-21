package tasks.task1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date (dd-mm-yy): ");
        String date = scanner.next();

        String day = findDayOfWeek(date);
        System.out.println(day);
    }

    private static String findDayOfWeek(String date) {
        Pattern pattern = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            int day = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int year = Integer.parseInt(matcher.group(3));
            LocalDate localDate = LocalDate.of(year, month, day);
            return String.valueOf(localDate.getDayOfWeek());
        } else {
            return "error";
        }
    }
}
