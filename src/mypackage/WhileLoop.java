package mypackage;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---------------- Example 1 ----------------
        // Keep asking until name is not empty

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello! " + name);
        System.out.println();

        // ---------------- Example 2 ----------------
        // Quit imaginary game when user presses Q

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing an imaginary game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");
        System.out.println();

        // ---------------- Example 3 ----------------
        // Validate age using while loop

        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Please enter a valid age!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");
        System.out.println();

        // Same logic using do-while loop

        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Please enter a valid age!");
            }

        } while (age < 0);

        System.out.println("You are " + age + " years old");
        System.out.println();

        // ---------------- Example 4 ----------------
        // Number between 1 and 10

        int number = 0;

        while (number < 1 || number > 10) {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }

        System.out.println("Number you picked: " + number);

        scanner.close();
    }
}
