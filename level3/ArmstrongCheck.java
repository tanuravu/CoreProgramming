import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Initialize sum to 0 and store the original number
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use a while loop to extract digits and compute the cube of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;           // Get last digit
            sum += digit * digit * digit;              // Add cube of digit to sum
            originalNumber = originalNumber / 10;      // Remove last digit
        }

        // Step 4: Compare the sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }
}
