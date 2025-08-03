package JavaMethods.Level2;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<1){
            return;
        }
        int sum1 = recursionSum(num);
        int sum2 = formulaSum(num);
        if(sum1 == sum2){
            System.out.println("Sum from recursion and Formula are same");
        }else{
            System.out.println("Sum from both methods is not equal.");
        }
    }
    public static int recursionSum(int n){
        if(n==1){
            return 1;
        }
        else{
             return n+recursionSum(n-1);
        }
    }
    public static int formulaSum(int n){
        return n*(n+1)/2;
    }
}
