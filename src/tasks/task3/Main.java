package tasks.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phone = scanner.next();

        boolean response = checkPhoneNumber(phone);
        if (response) {
            System.out.println("Your number is correct: " + phone);
        } else {
            System.out.println("Your number is incorrect: " + phone);
            System.out.println("Sample number: (+998xxxxxxxxx)");
        }
    }

    private static boolean checkPhoneNumber(String phone) {
        Pattern pattern = Pattern.compile("^(\\+998)(\\d{9})");
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
