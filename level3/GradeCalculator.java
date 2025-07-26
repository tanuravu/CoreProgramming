import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = input.nextInt();

        // Calculate total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Display average (percentage)
        System.out.println("\nAverage Marks (Percentage): " + percentage + "%");

        // Determine Grade and Remarks
        String grade;
        String remarks;

        if (percentage >= 90 && percentage <= 100) {
            grade = "A+";
            remarks = "Outstanding";
        } else if (percentage >= 75) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 35) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Output results
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
