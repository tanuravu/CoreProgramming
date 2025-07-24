package ProgrammingElements.Level1;

import java.util.Scanner;

public class DistanceYards2Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in feet: ");
        float ditsanceInFeet=sc.nextFloat();
        float distanceInYards = ditsanceInFeet / 3f;
        float distanceInMiles = distanceInYards / 1760f;

        System.out.println("\n Distance Conversions:");
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);
    }
}
