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
    }
}