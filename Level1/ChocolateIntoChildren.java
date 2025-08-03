package JavaMethods.Level1;

import java.util.Scanner;

public class ChocolateIntoChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfchocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int [] ans = findRemainderAndQuotient(numberOfchocolates,numberOfChildren);
        System.out.println("Each student gets  = "+ans[0] + " chocolates");
        System.out.println("Remaining Chocolates = "+ans[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int [] res = new int[2];
        res[0] = number/divisor;
        res[1]= number%divisor;
        return res;
    }
}
