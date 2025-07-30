package Methods;
import java.util.Scanner;

public class TriangularRun {
    public static double calculateRounds(double a, double b, double c, double totalDistanceKm) {
        double perimeter = a + b + c; // total distance for one round
        double totalDistanceMeters = totalDistanceKm * 1000; // convert km to meters
        double rounds = totalDistanceMeters / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A (in meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side B (in meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side C (in meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c, 5); // 5 km run
        System.out.printf("Athlete must complete %.2f rounds to cover 5 km.\n", rounds);

        sc.close(); // good practice
    }
}
