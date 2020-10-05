package Exceptions;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        // Prompt the user to enter two integers
        System.out.print("Enter two numbers: ");
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                // Display the result
                System.out.println(
                        "The sum is " + (number1 + number2));

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: two integers are required) ");
                input.nextLine(); // Discard input
            }
        } while (continueInput);
    }
}