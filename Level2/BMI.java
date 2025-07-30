package JavaMethods.Level2;

import java.util.Scanner;

public class BMI {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] memberData = new double[10][3];
        for (int i = 0; i < memberData.length; i++) {
            System.out.println("Enter weight of member " + (i + 1) + " in kg:");
            memberData[i][0] = sc.nextDouble();
            System.out.println("Enter height of member " + (i + 1) + " in cm:");
            memberData[i][1] = sc.nextDouble();
        }
        calculateBMI(memberData);
        String[] statuses = determineBMIStatus(memberData);
        for (int i = 0; i < memberData.length; i++) {
            System.out.printf("Member %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s\n",
                (i + 1), memberData[i][0], memberData[i][1], memberData[i][2], statuses[i]);
        }
    }
}
