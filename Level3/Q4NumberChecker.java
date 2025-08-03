package JavaMethods.Level3;
import java.util.Arrays;
import java.util.Scanner;

public class Q4NumberChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);
        int[] reversedDigits = reverseArray(digits);
        boolean palindrome = isPalindrome(number);
        boolean duck = isDuckNumber(digits);
        boolean arraysMatch = areArraysEqual(digits, reversedDigits);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Original Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));
        System.out.println("Arrays Equal: " + (arraysMatch ? "Yes" : "No"));
        System.out.println("Palindrome: " + (palindrome ? "Yes" : "No"));
        System.out.println("Duck Number: " + (duck ? "Yes" : "No"));
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
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int number) {
        int[] original = extractDigits(number);
        int[] reversed = reverseArray(original);
        return areArraysEqual(original, reversed);
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    
}

