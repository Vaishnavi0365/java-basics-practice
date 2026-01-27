package mypackage;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        // ===== MATH CONSTANTS =====
        System.out.println("The value of PI is: " + Math.PI);
        System.out.println("The value of E is: " + Math.E);

        // ===== MATH FUNCTIONS DEMO =====
        System.out.println("\n--- Math Function Results ---");
        System.out.println("2^5 = " + Math.pow(2, 5));
        System.out.println("Square root of 9 = " + Math.sqrt(9));
        System.out.println("Absolute value of -5 = " + Math.abs(-5));
        System.out.println("Round of 3.14 = " + Math.round(3.14));
        System.out.println("Ceil of 3.14 = " + Math.ceil(3.14));
        System.out.println("Floor of 3.99 = " + Math.floor(3.99));
        System.out.println("Max of 10 and 20 = " + Math.max(10, 20));
        System.out.println("Min of 10 and 20 = " + Math.min(10, 20));

        // ===== HYPOTENUSE CALCULATION =====
        // c = sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("\nEnter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse (Side c) is: " + c + " cm");

        // ===== CIRCLE CALCULATIONS =====
        // circumference = 2 * PI * radius
        // area = PI * radius^2
        // volume = (4/3) * PI * radius^3

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("\nEnter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1f cm\n", circumference);
        System.out.printf("The area is: %.1f cm²\n", area);
        System.out.printf("The volume is: %.1f cm³\n", volume);

        // Close scanner
        scanner.close();
    }
}
