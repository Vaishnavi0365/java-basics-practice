package mypackage;

public class BreakAndContinueDemo {

    public static void main(String[] args) {

        // Demonstrating break statement
        for (int i = 0; i <= 10; i++) {

            if (i == 5) {
                break; // Exit loop when i is 5
            }

            System.out.println(i);
        }

        System.out.println();

        // Demonstrating continue statement
        for (int i = 0; i <= 10; i++) {

            if (i == 5) {
                continue; // Skip iteration when i is 5
            }

            System.out.println(i);
        }
    }
}
