package JavaMethods.Level3;
import java.util.Scanner;
import java.util.Arrays;
public class Q3NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = extractDigits(number);
        int digitCount = countDigits(number);
        int digitSum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean harshad = isHarshadNumber(number, digits);
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Count: " + digitCount);
        System.out.print("Digits: " + Arrays.toString(digits));
        System.out.println("\nSum of Digits: " + digitSum);
        System.out.println("Sum of Squares of Digits: " + squareSum);
        System.out.println("Harshad Number: " + (harshad ? "Yes" : "No"));
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0)
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
        }
    }
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] extractDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return digitSum != 0 && number % digitSum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i; 
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}

