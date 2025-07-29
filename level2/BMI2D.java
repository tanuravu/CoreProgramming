import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; // [][0]=height, [][1]=weight, [][2]=BMI
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            for (int attempt = 0; attempt < 1; ) {
                System.out.print("Enter height in meters (positive): ");
                double h = sc.nextDouble();
                if (h > 0) {
                    personData[i][0] = h;
                    attempt++;
                } else {
                    System.out.println("Height must be positive!");
                }
            }
            for (int attempt = 0; attempt < 1; ) {
                System.out.print("Enter weight in kilograms (positive): ");
                double w = sc.nextDouble();
                if (w > 0) {
                    personData[i][1] = w;
                    attempt++;
                } else {
                    System.out.println("Weight must be positive!");
                }
            }
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height = " + personData[i][0] + " meters");
            System.out.println("Weight = " + personData[i][1] + " kg");
            System.out.printf("BMI = %.2f\n", personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println();
        }
    }
}
