package JavaStrings.Level3;
import java.util.Scanner;
public class Q7PalindromCheck {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Iterative Logic: " + (isPalindromeIterative(normalized) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive Logic: " + (isPalindromeRecursive(normalized, 0, normalized.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Array Comparison: " + (isPalindromeArray(normalized) ? "Palindrome" : "Not Palindrome"));
    }
}
