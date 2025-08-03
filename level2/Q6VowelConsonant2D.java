package JavaStrings.Level2;
import java.util.Scanner;
public class Q6VowelConsonant2D {
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    public static String[][] analyzeCharacters(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] characterTable = analyzeCharacters(input);
        displayTable(characterTable);
    }
}
