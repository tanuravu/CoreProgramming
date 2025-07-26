import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take weight (in kg) and height (in cm) as input
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = input.nextDouble();

        // Step 2: Convert height to meters
        double heightMeters = heightCm / 100;

        // Step 3: Calculate BMI using formula: BMI = weight / (height in meters)^2
        double bmi = weight / (heightMeters * heightMeters);

        // Step 4: Display BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Step 5: Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 6: Display status
        System.out.println("Weight Status: " + status);
    }
}
