package mypackage;

import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Variable to store the day entered by the user
        String day;

        // Ask the user for input
        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine();

        // ===== ENHANCED SWITCH STATEMENT =====
        // Converts input to lowercase to make comparison case-insensitive
        switch (day.toLowerCase()) {

            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a Weekday!");

            case "saturday", "sunday" ->
                    System.out.println("It is a Weekend!");

            default ->
                    System.out.println(day + " is not a valid day");
        }

        // Close scanner
        scanner.close();
    }
}
