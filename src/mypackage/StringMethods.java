package mypackage;

public class StringMethods {

    public static void main(String[] args) {

        // Original string
        String name = "Vaishnavi";

        // ===== BASIC STRING METHODS =====
        int length = name.length();           // Length of the string
        char firstLetter = name.charAt(0);    // Character at index 0
        int firstIndex = name.indexOf("i");   // First occurrence of 'i'
        int lastIndex = name.lastIndexOf("i");// Last occurrence of 'i'

        // Print basic results
        System.out.println("Length: " + length);
        System.out.println("First letter: " + firstLetter);
        System.out.println("First index of 'i': " + firstIndex);
        System.out.println("Last index of 'i': " + lastIndex);

        // ===== STRING MODIFICATION METHODS =====
        name = name.toUpperCase();             // Convert to uppercase
        name = name.toLowerCase();             // Convert to lowercase
        name = name.trim();                    // Remove leading/trailing spaces
        name = name.replace("i", "c");         // Replace characters

        System.out.println("Modified name: " + name);

        // ===== EMPTY CHECK =====
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        // ===== SPACE CHECK =====
        if (name.contains(" ")) {
            System.out.println("Your name contains space");
        } else {
            System.out.println("Your name doesn't contain any space");
        }

        // ===== EQUALS CHECK =====
        if (name.equals("password")) {
            System.out.println("Your name can't be 'password'");
        } else {
            System.out.println("Valid name (case-sensitive check)");
        }

        // ===== EQUALS IGNORE CASE CHECK =====
        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be 'password' (case-insensitive)");
        } else {
            System.out.println("Valid name (case-insensitive check)");
        }
    }
}
