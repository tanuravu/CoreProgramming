package JavaMethods.Level3;

import java.util.Scanner;

public class Q6NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + getGreatestFactor(factors, num));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.printf("Product of Cubes of Factors: %.2f%n", cubeProductFactors(factors));
        System.out.println("Perfect Number: " + (isPerfectNumber(num, factors) ? "Yes" : "No"));
        System.out.println("Abundant Number: " + (isAbundantNumber(num, factors) ? "Yes" : "No"));
        System.out.println("Deficient Number: " + (isDeficientNumber(num, factors) ? "Yes" : "No"));
        System.out.println("Strong Number: " + (isStrongNumber(num) ? "Yes" : "No"));
    }
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }
    public static int getGreatestFactor(int[] factors, int num) {
        int max = 1;
        for (int f : factors) {
            if (f != num && f > max) max = f;
        }
        return max;
    }
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }
    public static double cubeProductFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }
    public static boolean isPerfectNumber(int num, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != num) sum += f;
        }
        return sum == num;
    }
    public static boolean isAbundantNumber(int num, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != num) sum += f;
        }
        return sum > num;
    }
    public static boolean isDeficientNumber(int num, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != num) sum += f;
        }
        return sum < num;
    }
    public static boolean isStrongNumber(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
}
