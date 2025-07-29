package Array;

import java.util.Scanner;

public class RangeMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to find multiplication table for 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            multiplicationResult[i] = number * multiplier;
        }
        System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}
