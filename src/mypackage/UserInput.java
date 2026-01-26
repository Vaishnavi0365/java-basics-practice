package mypackage;

import java.util.Scanner; // Import Scanner class for user input

public class UserInput {

    public static void main(String[] args) {

        // Variable declarations
        int age;                // Stores age (whole number)
        String name;            // Stores name (text)
        float cgpa;             // Stores CGPA (decimal)
        double fees;            // Stores fees (decimal with more precision)
        char gender;            // Stores gender initial (single character)
        boolean isStudent;      // Stores true/false
        long phoneNumber;       // Stores large numbers like phone number
        byte semester;          // Stores small numbers (semester count)
        short yearOfBirth;      // Stores year of birth

        // Create Scanner object to take input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();  // Reads a full line

        // Taking integer input
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();    // Reads an int

        // Taking float input
        System.out.print("Please enter your CGPA: ");
        cgpa = scanner.nextFloat(); // Reads a float

        // Taking double input
        System.out.print("Please enter your total fees: ");
        fees = scanner.nextDouble(); // Reads a double

        // Taking char input
        System.out.print("Please enter your gender (M/F): ");
        gender = scanner.next().charAt(0); 
        // scanner.next() → reads a word (String)
        // charAt(0) → takes the first character of that word

        // Taking boolean input
        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean(); // Reads true or false

        // Taking long input
        System.out.print("Please enter your phone number: ");
        phoneNumber = scanner.nextLong(); // Reads a long

        // Taking byte input
        System.out.print("Please enter your semester: ");
        semester = scanner.nextByte(); // Reads a byte

        // Taking short input
        System.out.print("Please enter your year of birth: ");
        yearOfBirth = scanner.nextShort(); // Reads a short

        // Displaying all user details
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Fees: " + fees);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Semester: " + semester);
        System.out.println("Year of Birth: " + yearOfBirth);

        // Close the scanner to free resources
        scanner.close();
    }
}
