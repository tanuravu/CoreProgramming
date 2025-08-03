package JavaStrings.Level1;
import java.util.Scanner;

public class Q7NumberFormat {

    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to parse as integer: ");
        String userInput = scanner.nextLine();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(userInput); 
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(userInput); 
    }
}
