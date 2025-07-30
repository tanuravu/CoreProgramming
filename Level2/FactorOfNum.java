package JavaMethods.Level2;

import java.util.Scanner;

public class FactorOfNum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of Factors = " + getSum(factors));
        System.out.println("Product of Factors = " + getProduct(factors));
        System.out.println("Sum of Squares of Factors = " + getSumOfSquares(factors));
    }
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count++;    
            } 
        }
        int[] factorArray = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                factorArray[index] = i;
                index++;
            } 
        }
        return factorArray;
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int val : arr){
            sum += val;
        } 
        return sum;
    }
    public static long getProduct(int[] arr) {
        long prod = 1;
        for (int val : arr){
            prod *= val;
        } 
        return prod;
    }
    public static double getSumOfSquares(int[] arr) {
        double sumSq = 0;
        for (int val : arr){
            sumSq += Math.pow(val, 2);
        } 
        return sumSq;
    }
}
