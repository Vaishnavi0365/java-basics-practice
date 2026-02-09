package mypackage;

public class MethodsDemo {

    public static void main(String[] args) {

        String name = "Vaishnavi";
        int age = 19;

        // Method call with parameters
        happyBirthday(name, age);

        // Methods with return values
        System.out.println("Square: " + square(3));
        System.out.println("Cube: " + cube(3));

        // Method returning String
        String fullName = getFullName("Vaishnavi", "Patil");
        System.out.println("Full Name: " + fullName);

        // Method returning boolean
        if (ageCheck(age)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }
    }

    // Void method
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to You!");
        System.out.printf("Happy Birthday dear %s!%n", name);
        System.out.printf("You are %d years old!%n", age);
        System.out.println("Happy Birthday to You!\n");
    }

    // Method returning square of a number
    static double square(double number) {
        return number * number;
    }

    // Method returning cube of a number
    static double cube(double number) {
        return number * number * number;
    }

    // Method returning full name
    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    // Method returning boolean
    static boolean ageCheck(int age) {
        return age >= 18;
    }
}
