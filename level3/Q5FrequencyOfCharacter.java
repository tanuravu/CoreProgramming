package JavaStrings.Level3;
import java.util.Scanner;
public class Q5FrequencyOfCharacter {

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] unique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findFrequency(input);

        System.out.println("\nCharacter Frequencies:");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("----------------------------");

        for (String[] entry : frequencies) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }
    }
}
