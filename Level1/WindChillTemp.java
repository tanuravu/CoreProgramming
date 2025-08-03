package JavaMethods.Level1;

import java.util.Scanner;

public class WindChillTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        double ans = calculateWindChill(temperature,windSpeed);
        System.out.println("Wind Chill Temperature = "+ans); 
    }
    public static double calculateWindChill(double temp, double windSpeed){
        double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
}
