package JavaStrings.Level1;
import java.util.Scanner;
public class Q3CharacterComparision {

    
    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        char[] customChars = getCharacters(input);
        char[] builtInChars = input.toCharArray();
        boolean isEqual = compareArrays(customChars, builtInChars);

        System.out.println("Custom method characters:");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in toCharArray() characters:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + isEqual);
    }
}
