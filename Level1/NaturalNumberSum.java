package Methods;
import java.util.Scanner;

public class NaturalNumberSum {
    public static int sumNaturalNumbers(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int totalSum = sumNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + totalSum);
        }
    }

}
