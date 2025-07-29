import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = new int[numStudents][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int subj = 0; subj < 3; subj++) {
                String subject = (subj == 0) ? "Physics" : (subj == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks in " + subject + ": ");
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("Marks must be positive! Re-enter this student's data.");
                    i--;
                    break;
                } else {
                    marks[i][subj] = mark;
                }
            }
            if (marks[i][0] == 0 && marks[i][1] == 0 && marks[i][2] == 0) continue;
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if(percentages[i]>=40){
                grades[i] = "E";
            }
            else {
                grades[i] = "R";
            }
        }
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics = " + marks[i][0]);
            System.out.println("Chemistry = " + marks[i][1]);
            System.out.println("Maths = " + marks[i][2]);
            System.out.printf("Percentage = %.2f%%\n", percentages[i]);
            System.out.println("Grade = " + grades[i]);
            System.out.println();
        }
    }
}
