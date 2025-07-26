import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true; // Assume number is prime

        // Prime check only for numbers > 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number - 1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }
}
