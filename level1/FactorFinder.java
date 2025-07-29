package Array;
import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxfactor = 10;
        int[] factors = new int[maxfactor];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (index == maxfactor) {
                    maxfactor = maxfactor * 2;
                    int[] temp = new int[maxfactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                } else {
                    factors[index++] = i;
                }
            }
        }
        System.out.print("Factors of " + n + " are : ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}