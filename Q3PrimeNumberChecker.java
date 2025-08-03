package Day8ProblemStatement.AdditionalQues;
import java.util.Scanner;

public class Q3PrimeNumberChecker{
    public static void main(String[] args) {
        int num = getInput();
        System.out.println(num + " is " + (isPrime(num) ? "a prime number." : "not a prime number."));
    }

    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
