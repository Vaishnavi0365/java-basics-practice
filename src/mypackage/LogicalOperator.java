package mypackage;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {

        // Weather check using logical operators
        double temperature = 25;
        boolean isSunny = true;

        if (temperature >= 0 && temperature <= 30 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is sunny outside");
        } 
        else if (temperature >= 0 && temperature <= 30 && !isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is cloudy outside");
        } 
        else {
            System.out.println("The weather is bad");
        }

        // Username validation program
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your new username: ");
        String username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters");
        } 
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } 
        else {
            System.out.println("Welcome, " + username + "!");
        }

        scanner.close();
    }
}
