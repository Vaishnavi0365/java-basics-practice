package mypackage;

import java.util.Scanner;

public class NestedIfDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String isStudent;
        String isSenior;
        double price = 9.99;

        // Take user input
        System.out.print("Are you a student? (yes/no): ");
        isStudent = scanner.nextLine();

        System.out.print("Are you a senior? (yes/no): ");
        isSenior = scanner.nextLine();

        // ===== NESTED IF LOGIC =====
        if (isStudent.equalsIgnoreCase("yes")) {

            // Student discount
            if (isSenior.equalsIgnoreCase("yes")) {

                // Student + Senior discount (30%)
                System.out.println("You get a Student discount of 10%");
                System.out.println("You get a Senior discount of 20%");
                price *= 0.7;

            } else {

                // Only Student discount (10%)
                System.out.println("You get a Student discount of 10%");
                price *= 0.9;
            }

        } else {

            // Not a student
            if (isSenior.equalsIgnoreCase("yes")) {

                // Only Senior discount (20%)
                System.out.println("You get a Senior discount of 20%");
                price *= 0.8;
            }
        }

        // Final price
        System.out.printf("The price of a ticket is: $%.2f", price);

        scanner.close();
    }
}
