package Homework;
import java.util.*;
public class ConversionKm2M {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Distance in KM: ");
        double KM=sc.nextDouble();
        double miles=KM*0.621371;
        System.out.println("Miles: "+miles);
    }
}
