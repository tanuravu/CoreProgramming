package Level2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double ans1 = a+b*c;
        double ans2 = a*b+c;
        double ans3 = c+a/b;
        double ans4 = a%b+c;
        System.out.println("Results are - "+ ans1+", "+ans2+", "+ans3+",and "+ans4);
    }
}
