package mypackage;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) throws InterruptedException {

        // Basic for loop (1 to 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // For loop with step increment (1 to 10, step +3)
        for (int i = 1; i <= 10; i += 3) {
            System.out.println(i);
        }

        System.out.println();

        // Reverse for loop (10 to 1)
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        // Reverse loop with step decrement (step -3)
        for (int i = 10; i > 0; i -= 3) {
            System.out.println(i);
        }

        System.out.println();

        // User-controlled loop
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }
        
        System.out.println();

        // Countdown timer
        System.out.print("How many seconds to countdown from? ");
        int start = scanner.nextInt();

        System.out.println();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Pause for 1 second
        }

        System.out.println("🎉 HAPPY NEW YEAR!");

        scanner.close();
    }
}
