import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get integer input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Initialize sum of divisors to 0
        int sum = 0;

        // Step 3: Loop from 1 to number - 1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add the divisor to sum
            }
        }

        // Step 4: Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }
}
