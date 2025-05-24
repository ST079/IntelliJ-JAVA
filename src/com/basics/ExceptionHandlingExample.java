package com.basics;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Example of NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Example of NumberFormatException
        try {
            String invalidNumber = "abc123";
            int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // Finally block to demonstrate cleanup or final actions
        finally {
            System.out.println("Execution completed.");
        }
    }
}
