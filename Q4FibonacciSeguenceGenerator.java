package Day8ProblemStatement.AdditionalQues;
import java.util.Scanner;

public class Q4FibonacciSeguenceGenerator {
    public static void main(String[] args) {
        int terms = getInput();
        generateFibonacci(terms);
    }

    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        return scanner.nextInt();
    }

    static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
