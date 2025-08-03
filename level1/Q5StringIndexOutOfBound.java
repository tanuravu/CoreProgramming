package JavaStrings.Level1;
import java.util.Scanner;
public class Q5StringIndexOutOfBound {

    public static void generateException(String input) {
        System.out.println("Character at index 100: " + input.charAt(100));
    }

    public static void handleException(String input) {
        try {
            System.out.println("Character at index 100: " + input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(userInput); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(userInput); 
    }
}
