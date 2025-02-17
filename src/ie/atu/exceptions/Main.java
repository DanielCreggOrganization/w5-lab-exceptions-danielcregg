package ie.atu.exceptions;

import java.util.Scanner;

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
    }
}