package ControlFlow;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int minAgeIndex = (ages[0] < ages[1] && ages[0] < ages[2]) ? 0 :
                (ages[1] < ages[2]) ? 1 : 2;

        int maxHeightIndex = (heights[0] > heights[1] && heights[0] > heights[2]) ? 0 :
                (heights[1] > heights[2]) ? 1 : 2;

        System.out.println("Youngest is " + names[minAgeIndex]);
        System.out.println("Tallest is " + names[maxHeightIndex]);
    }
}
