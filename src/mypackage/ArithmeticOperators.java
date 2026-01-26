package mypackage;

import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {

        //SCANNER OBJECT
        //Used to take input from the user
        Scanner scanner = new Scanner(System.in);

        //VARIABLE DECLARATIONS
        double x;
        double y;
        double add, sub, mul, div;

        //USER INPUT SECTION
        System.out.print("Enter First Value: ");
        x = scanner.nextDouble();

        System.out.print("Enter Second Value: ");
        y = scanner.nextDouble();

        //ARITHMETIC OPERATIONS
        add = x + y;   // Addition
        sub = x - y;   // Subtraction
        mul = x * y;   // Multiplication

        //OUTPUT SECTION
        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);

        //SAFE DIVISION LOGIC
        // Check to avoid division by zero
        if (y != 0) {
            div = x / y;   // Division
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        //AUGMENTED ASSIGNMENT OPERATORS
        int a = 10;
        int b = 30;

        System.out.println("\n--- Augmented Assignment Operators ---");

        a += b;   // a = a + b
        System.out.println("After a += b : " + a);

        a -= b;   // a = a - b
        System.out.println("After a -= b : " + a);

        a *= b;   // a = a * b
        System.out.println("After a *= b : " + a);

        a /= b;   // a = a / b
        System.out.println("After a /= b : " + a);

        //INCREMENT AND DECREMENT OPERATORS
        System.out.println("\n--- Increment and Decrement ---");

        a++;   //Increment a by 1
        System.out.println("After a++ : " + a);

        a--;   //Decrement a by 1
        System.out.println("After a-- : " + a);

        //CLOSE SCANNER
        //Free system resources
        scanner.close();
    }
}
