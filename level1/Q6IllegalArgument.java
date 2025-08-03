package JavaStrings.Level1;
import java.util.Scanner;
public class Q6IllegalArgument {

    public static void generateException(String input) {
        System.out.println("Substring: " + input.substring(5, 2));
    }
    public static void handleException(String input) {
        try {
            System.out.println("Substring: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(userInput); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(userInput); 
    }
}
