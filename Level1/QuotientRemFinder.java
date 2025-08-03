package JavaMethods.Level1;

import java.util.Scanner;

public class QuotientRemFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter divisor");
        int divisor = sc.nextInt();
        int [] ans = findRemainderAndQuotient(num,divisor);
        System.out.println("Quotient  = "+ans[0]);
        System.out.println("Remainder = "+ans[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int [] res = new int[2];
        res[0] = number/divisor;
        res[1]= number%divisor;
        return res;
    }
}
