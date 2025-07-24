package ProgrammingElements.Level1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base of Triangle: ");
        float base=sc.nextFloat();
        System.out.println("Enter the height of Triangle: ");
        float height=sc.nextFloat();

        float areaInSqInches = 0.5f * base * height;
        float areaInSqCm = areaInSqInches * 6.4516f; // 1 sq inch = 6.4516 sq cm

        float heightInCm = height * 2.54f;
        float heightInFeet = height / 12f;


        System.out.println("\n Triangle Area Results:");
        System.out.println("Area of triangle: " + areaInSqInches + " square inches");
        System.out.println("Area of triangle: " + areaInSqCm + " square centimeters");

        System.out.println("\n Height Conversion:");
        System.out.println("Your Height in cm is " + heightInCm +
                " while in feet is " + heightInFeet +
                " and inches is " + height);
    }
}
