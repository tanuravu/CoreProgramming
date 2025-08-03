package JavaStrings.Level1;
import java.util.Scanner;
public class Q10TextToLowerCase {
    public static String convertToLower(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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
        String builtInLower = userInput.toLowerCase();
        String manualLower = convertToLower(userInput);
        boolean areEqual = compareStrings(builtInLower, manualLower);
        System.out.println("\nBuilt-in toLowerCase(): " + builtInLower);
        System.out.println("Manual conversion:     " + manualLower);
        System.out.println("Are both results equal? " + areEqual);
    }
}
