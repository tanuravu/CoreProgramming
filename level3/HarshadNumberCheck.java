import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get integer input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Initialize sum variable to 0
        int sum = 0;

        // Step 3: Copy original number for processing
        int originalNumber = number;

        // Step 4: Use while loop to calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  // Get last digit
            sum += digit;                     // Add digit to sum
            originalNumber = originalNumber / 10; // Remove last digit
        }

        // Step 5: Check if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
