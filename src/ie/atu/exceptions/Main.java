package ie.atu.exceptions;

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
        try {
                        int numerator = 10;
                                    int denominator = 0;
                                                int result = numerator / denominator;
                                                            System.out.println("Result: " + result);
                                                                    } catch (ArithmeticException e) {
                                                                                System.out.println("Caught ArithmeticException: " + e.getMessage());
                                                                                        }
        }
    }
}