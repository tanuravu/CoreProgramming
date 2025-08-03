package JavaMethods.Level1;

import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side (in meters)");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side (in meter)");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side (in meters)");
        int c = sc.nextInt();
        int distance = 5000;
        int ans = rounds(a,b,c,distance);
        System.out.println("Rounds taken bt athlete = "+ans);
    }
    public static int rounds(int a,int b, int c, int distance){
        int perimeter = a+b+c;
        int round = distance/perimeter;
        return round;
    }
}
