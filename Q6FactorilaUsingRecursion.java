package Day8ProblemStatement.AdditionalQues;
import java.util.Scanner;

public class Q6FactorilaUsingRecursion {
    public static void main(String[] args) {
        int num = getInput();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
