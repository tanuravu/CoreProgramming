package JavaStrings.Level3;
import java.util.Scanner;
public class Q4CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        boolean[] added = new boolean[256];
        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!added[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                added[ch] = true;
                index++;
            }
        }

        String[][] trimmedResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            trimmedResult[i][0] = result[i][0];
            trimmedResult[i][1] = result[i][1];
        }

        return trimmedResult;
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
