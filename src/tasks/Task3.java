package tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your phone number: ");
        String phone = scanner.nextLine();

        boolean response = checkPhoneNumber(phone);
    }

    private static boolean checkPhoneNumber(String phone) {
        return false;
    }

}
