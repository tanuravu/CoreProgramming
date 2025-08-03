package JavaStrings.Level1;

import java.util.Scanner;

public class Q2CompareSubstring {

    
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareByCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Substrings
        String manualSub = customSubstring(input, start, end);
        String builtInSub = input.substring(start, end);

        // Compare results
        boolean isSame = compareByCharAt(manualSub, builtInSub);

        // Display outcomes
        System.out.println("\nManual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);

        if (isSame) {
            System.out.println("Both substrings are identical!");
        } else {
            System.out.println("Substrings differ.");
        }
    }
}
