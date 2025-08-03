package Day8ProblemStatement.AdditionalQues;
import java.util.Scanner;
public class Q5PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        System.out.println("The string is " + (result ? "a palindrome." : "not a palindrome."));
    }

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
