package Level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int ans1 = a+b*c;
        int ans2 = a*b+c;
        int ans3 = c+a/b;
        int ans4 = a%b+c;
        System.out.println("Results are - "+ ans1+", "+ans2+", "+ans3+",and "+ans4);
    }
}
