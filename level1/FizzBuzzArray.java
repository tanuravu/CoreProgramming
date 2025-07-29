
package Array;
import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }
        String[] results = new String[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        // Step 5: Display results using index position
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
