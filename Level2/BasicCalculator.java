package Level2;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 =input.nextFloat();
        float num2 = input.nextFloat();
        float add = num1+num2;
        float sub = num1 - num2;
        float multiply = num1*num2;
        float division = num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+", "+sub+", "+multiply+", and "+division);
    }
}
