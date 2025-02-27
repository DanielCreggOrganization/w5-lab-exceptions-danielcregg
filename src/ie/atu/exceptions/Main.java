package ie.atu.exceptions;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exception handling program is running!");

        // Section 1 - Introduction DIY Exercise
        String text = null;
        if (text != null) {
            System.out.println("Text length: " + text.length());
        } else {
            System.out.println("Text is null. Cannot retrieve length.");
        }

        // Section 2 - DIY Exercise with ArithmeticException
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Section 3 - DIY Exercise with finally block
        System.out.println("\nSimulating file processing:");
        try {
            System.out.println("Opening file...");
            throw new Exception("Error reading file");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("File processing complete.");
        }

        // Section 4 - DIY Exercise with try-with-resources
        System.out.println("\nEnter a number to calculate its square:");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println("Square: " + (number * number));
        } catch (Exception e) {
            System.out.println("Error reading number: " + e.getMessage());
        }

        // Section 5 - DIY Exercise demonstrating checked and unchecked exceptions
        System.out.println("\nDemonstrating checked and unchecked exceptions:");
        try {
            FileReader reader = new FileReader("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Demonstrate unchecked exception (ArrayIndexOutOfBoundsException)
        int[] emptyArray = new int[0];
        System.out.println(emptyArray[0]); // This will throw the exception

        // Section 6 - Test calculateGrade method
        System.out.println("\nTesting grade calculation:");
        try {
            calculateGrade(150); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Section 7 - Test BankAccount with InsufficientFundsException
        System.out.println("\nTesting bank account:");
        BankAccount account = new BankAccount(100);
        try {
            account.withdraw(150); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Section 8 - Error vs Exception Demo
        System.out.println("\nError vs Exception explanation:");
        
        /*
         * Why Errors are not typically caught:
         * 
         * 1. Errors indicate serious problems at the JVM/system level that the application
         *    cannot reasonably recover from or handle.
         * 
         * 2. Examples of such Errors:
         *    - OutOfMemoryError: JVM has exhausted available memory
         *    - StackOverflowError: Infinite recursion or excessive method calls
         *    - LinkageError: Class dependencies are broken
         * 
         * 3. Best practices:
         *    - Let errors propagate and terminate the program
         *    - Focus on preventing errors through proper resource management
         *    - Use monitoring and logging to detect potential issues
         * 
         * Example of code that could cause an Error (DO NOT UNCOMMENT):
         * // Infinite recursion causing StackOverflowError
         * // public static void recurse() { recurse(); }
         */
        
        System.out.println("Program continues normally.");

    } // End of main method

    // Section 6 - DIY Exercise with throw keyword
    public static void calculateGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score");
        }
        System.out.println("Valid score: " + score);
    }
} // End of Main class