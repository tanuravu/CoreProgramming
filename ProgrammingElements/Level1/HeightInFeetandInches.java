import java.util.Scanner;

public class HeightInFeetandInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height= input.nextInt();
        double inches = height*2.54;
        double foot = 12*inches;
        System.out.println("Your Height in cm is "+height+" while in feet is "+foot+" and inches is "+inches);
    }

}
