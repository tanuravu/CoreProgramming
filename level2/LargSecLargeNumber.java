import java.util.Scanner;
public class LargSecLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
