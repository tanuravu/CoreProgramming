import java.util.Scanner;
import java.util.Random;

public class Q1NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = generateGuess(low, high, rand);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! Guessed it right.");
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
        }
    }

    static int generateGuess(int low, int high, Random rand) {
        return rand.nextInt(high - low + 1) + low;
    }
}
