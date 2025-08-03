package JavaMethods.Level3;

import java.util.Scanner;

public class Q5NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Prime Number: " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Neon Number: " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Spy Number: " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Automorphic Number: " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Buzz Number: " + (isBuzz(number) ? "Yes" : "No"));
    }
     public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static boolean isSpy(int num) {
        int sum = 0, prod = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp /= 10;
        }
        return sum == prod;
    }
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String nStr = String.valueOf(num);
        String sStr = String.valueOf(square);
        return sStr.endsWith(nStr);
    }
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
    
}
