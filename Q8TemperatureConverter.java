package Day8ProblemStatement.AdditionalQues;
import java.util.Scanner;

public class Q8TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert from (C/F): ");
        String choice = scanner.nextLine();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice.equalsIgnoreCase("C")) {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        }
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }
}
