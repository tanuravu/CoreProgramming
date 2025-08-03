package JavaStrings.Level2;
import java.util.Scanner;
public class Q4ShortestAndLongestString {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }
    public static String[] customSplit(String str) {
        int length = getLength(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2]; 
        spaceIndexes[0] = -1;
        int index = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }
    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = customSplit(input);
        String[][] wordTable = getWordLengthTable(words);
        int[] resultIndexes = findShortestAndLongest(wordTable);
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest word: " + wordTable[resultIndexes[0]][0]);
        System.out.println("Longest word: " + wordTable[resultIndexes[1]][0]);
    }
}
