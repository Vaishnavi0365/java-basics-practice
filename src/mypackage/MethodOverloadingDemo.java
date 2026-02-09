package mypackage;

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        System.out.println("Sum of 2 numbers: " + add(2, 3));
        System.out.println("Sum of 3 numbers: " + add(2, 3, 4));
        System.out.println("Sum of 4 numbers: " + add(2, 3, 4, 1));
    }

    // Method with 2 parameters
    static double add(double a, double b) {
        return a + b;
    }

    // Method with 3 parameters
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method with 4 parameters
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
