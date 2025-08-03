package JavaMethods.Level3;

import java.util.Random;

public class Q11EmployeeBonus {
    public static void main(String[] args) {
        int EMPLOYEES = 10;
    
        double[][] employeeData = generateEmployeeData(EMPLOYEES);
        double[][] bonusData = calculateBonus(employeeData);
    
        displayBonusTable(employeeData, bonusData);
    }
    public static double[][] generateEmployeeData(int employeeCount) {
        double[][] data = new double[employeeCount][2]; 
        Random rand = new Random();

        for (int i = 0; i < employeeCount; i++) {
            data[i][0] = rand.nextInt(90000) + 10000;
            data[i][1] = rand.nextInt(11);           
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] bonusData = new double[employeeData.length][2]; 

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusPercent = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            bonusData[i][0] = bonus;
            bonusData[i][1] = salary + bonus;
        }
        return bonusData;
    }
    public static void displayBonusTable(double[][] employeeData, double[][] bonusData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-10s %-10s %-12s %-12s %-12s%n",
                "Emp#", "Salary", "YearsService", "Bonus", "NewSalary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.printf("%-10d %-10.2f %-12.0f %-12.2f %-12.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }
        System.out.printf("Total Old Salary : %.2f%n", totalOld);
        System.out.printf("Total Bonus Paid : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNew);
    }
}
