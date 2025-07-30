package JavaMethods.Level2;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        if(year<1582){
            return;
        }
        if(isLeapYear(year)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Nogt a Leap Year");
        }
    }
    public static boolean isLeapYear(int n){
        if(n%4==0 && n%100!=0 ||n%400 ==0 ){
            return true;
        }
        return false;
    }
}
