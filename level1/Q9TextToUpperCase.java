package JavaStrings.Level1;
import java.util.Scanner;
public class Q9TextToUpperCase {
    public static String convertToUpper(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();
        String builtInUpper = userInput.toUpperCase();
        String manualUpper = convertToUpper(userInput);
        boolean areEqual = compareStrings(builtInUpper, manualUpper);
        System.out.println("\nBuilt-in toUpperCase(): " + builtInUpper);
        System.out.println("Manual conversion:     " + manualUpper);
        System.out.println("Are both results equal? " + areEqual);
    }
}
