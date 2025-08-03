package JavaMethods.Level2;

import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int [] ages = new int[3];
        double [] height = new double[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter age of "+names[i]);
            ages[i] = sc.nextInt();
            System.out.println("Enter height of "+names[i]);
            height[i] = sc.nextDouble();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(height);
        System.out.println("Youngest friend is: " + names[youngestIndex] + "=" + ages[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex] + " = " + height[tallestIndex]);
    }
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findTallest(double[] height) {
        int maxIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
