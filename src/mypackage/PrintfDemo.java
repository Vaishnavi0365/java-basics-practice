package mypackage;

public class PrintfDemo {

    public static void main(String[] args) {

        // printf() = a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "Vaishnavi";
        char firstLetter = 'S';
        int age = 19;
        double height = 60.5;
        boolean isEmployed = true;

        // ===== BASIC SPECIFIERS =====
        System.out.println("\n--- Basic Specifiers ---");
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed? %b\n", isEmployed);

        System.out.printf("%s is %d years old!\n", name, age);

        // ===== PRECISION =====
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.println("\n--- Precision Demo ---");
        System.out.printf("Price 1: %.1f\n", price1);
        System.out.printf("Price 2: %.1f\n", price2);
        System.out.printf("Price 3: %.1f\n", price3);

        // ===== FLAGS =====
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price4 = 9000.99;
        double price5 = 100000.15;
        double price6 = -54000.01;

        System.out.println("\n--- Comma Flag Demo ---");
        System.out.printf("%,.1f\n", price4);
        System.out.printf("%,.1f\n", price5);
        System.out.printf("%,.1f\n", price6);

        double price7 = 9.99;
        double price8 = 100.15;
        double price9 = -54.01;

        System.out.println("\n--- Plus Flag Demo ---");
        System.out.printf("%+.1f\n", price7);
        System.out.printf("%+.1f\n", price8);
        System.out.printf("%+.1f\n", price9);

        double price10 = 9.99;
        double price11 = 100.15;
        double price12 = -54.01;

        System.out.println("\n--- Parentheses Flag Demo ---");
        System.out.printf("%(.1f\n", price10);
        System.out.printf("%(.1f\n", price11);
        System.out.printf("%(.1f\n", price12);

        double price13 = 9.99;
        double price14 = 100.15;
        double price15 = -54.01;

        System.out.println("\n--- Space Flag Demo ---");
        System.out.printf("% .1f\n", price13);
        System.out.printf("% .1f\n", price14);
        System.out.printf("% .1f\n", price15);

        // ===== WIDTH =====
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println("\n--- Width: Zero Padding ---");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.println("\n--- Width: Right Justified ---");
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.println("\n--- Width: Left Justified ---");
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
