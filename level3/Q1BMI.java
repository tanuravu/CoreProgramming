package JavaStrings.Level3;
import java.util.Scanner;
public class Q1BMI  {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 40) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
            String.format("%.2f", heightCm),
            String.format("%.2f", weight),
            String.format("%.2f", bmi),
            status
        };
    }

    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            result[i] = calculateBMI(weight, height);
        }

        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] results = processBMI(data);
        System.out.println("\n=== BMI Results ===");
        displayResults(results);
    }
}
