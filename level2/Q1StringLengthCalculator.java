package JavaStrings.Level2;
import java.util.Scanner;

public class Q1StringLengthCalculator {

    public static int findLengthWithoutBuiltIn(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        int customLength = findLengthWithoutBuiltIn(userInput);
        int builtInLength = userInput.length();
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
