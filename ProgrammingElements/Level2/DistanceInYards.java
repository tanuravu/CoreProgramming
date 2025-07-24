package Level2;

import java.util.Scanner;

public class DistanceInYards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distanceInFeet = input.nextInt();
        int distanceInYards = distanceInFeet*3;
        int distanceInMile = distanceInYards*1760;
        System.out.println("The distance is yards is "+distanceInYards+" while the distance in miles is "+distanceInMile);
    }
}
