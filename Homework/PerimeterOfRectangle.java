package Homework;
import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length");
        int length =sc.nextInt();
        System.out.println("Enter the Breadth");
        int breadth=sc.nextInt();
        int Perimeter=2*(length+breadth);
        System.out.println("Perimeter of Rectangle: "+Perimeter);
    }
    
}
