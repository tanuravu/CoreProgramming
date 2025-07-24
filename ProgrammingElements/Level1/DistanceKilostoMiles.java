import java.util.Scanner;
public class DistanceKilostoMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner (System.in);
        km = input.nextInt();
        double miles = 1.6*km;
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
    }
}

