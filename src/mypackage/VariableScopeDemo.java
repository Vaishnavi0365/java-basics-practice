package mypackage;

public class VariableScopeDemo {

    static int x = 3; // Class-level (static) variable

    public static void main(String[] args) {

        int x = 1; // Local variable inside main()

        System.out.println("Local x in main(): " + x);

        doSomething();

        // Accessing class-level variable
        System.out.println("Class-level x: " + VariableScopeDemo.x);
    }

    static void doSomething() {

        int x = 2; // Local variable inside doSomething()

        System.out.println("Local x in doSomething(): " + x);
    }
}
