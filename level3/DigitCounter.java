import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get input number from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Step 2: Handle the case when number is 0
        if (number == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        // Step 3: Initialize count to 0
        int count = 0;

        // Step 4: Use loop to remove digits one by one
        while (number != 0) {
            number = number / 10;  // Remove last digit
            count++;               // Increase count
        }

        // Step 5: Display the result
        System.out.println("Number of digits: " + count);
    }
}
