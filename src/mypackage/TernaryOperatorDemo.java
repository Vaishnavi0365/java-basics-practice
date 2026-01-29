package mypackage;

import java.util.Scanner;

public class TernaryOperatorDemo {

    public static void main(String[] args) {

        // Ternary operator (? :) returns one of two values based on a condition
        // Syntax:
        // variable = (condition) ? valueIfTrue : valueIfFalse;

        Scanner scanner = new Scanner(System.in);

        // ===== PASS OR FAIL BASED ON PERCENTAGE =====
        int percentage;

        System.out.print("Enter your percentage: ");
        percentage = scanner.nextInt();

        String passOrFail = (percentage >= 60) ? "PASS" : "FAIL";
        System.out.println("Your result: " + passOrFail);

        // ===== EVEN OR ODD CHECK =====
        int number;

        System.out.print("\nEnter a number to check if it is even or odd: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("The number is: " + evenOrOdd);

        // ===== TIME OF THE DAY =====
        int hours;

        System.out.print("\nEnter the time (24-hour format): ");
        hours = scanner.nextInt();

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println("The time is: " + hours + " " + timeOfDay);

        // ===== INCOME TAX RATE =====
        int income;

        System.out.print("\nEnter your income: ");
        income = scanner.nextInt();

        String taxRate = (income >= 40000) ? "20%" : "10%";
        System.out.println("The tax rate applied is: " + taxRate);

        // Close scanner
        scanner.close();
    }
}
