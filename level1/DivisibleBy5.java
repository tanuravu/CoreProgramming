package ControlFlow;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean isDivisible=num%5==0;
        System.out.println("Is the number"+num+"divible by 5?"+isDivisible);
    }
}
