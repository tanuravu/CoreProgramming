package Methods.Level3;

public class Q9FindMostFrequent {
    public static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }
        }

        return maxChar;
    }
}
