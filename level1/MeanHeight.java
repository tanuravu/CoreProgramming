package Array;
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        System.out.print("Enter height of player: ");

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
        sc.close();
    }
}
