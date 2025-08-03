package JavaStrings.Level1;
import java.util.Scanner;
public class Q8ArraysOutOfBound {

    public static void generateException(String[] names) {
        System.out.println("Accessing name at index 10: " + names[10]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(names); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(names); 
    }
}
