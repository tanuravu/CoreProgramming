import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Check for valid Gregorian year
        if (year < 1582) {
            System.out.println("Year must be >= 1582 as per Gregorian calendar.");
        } else {
            // Multiple if-else statements
            if (year % 4 != 0) {
                System.out.println(year + " is Not a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        }
    }
}
