package Level2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        double base_ininches = base*2.54;
        double height_ininches = height*2.54;
        double area = (1/2)*base*height;
        double area_ininches = (1/2)*base_ininches*height_ininches;
        System.out.println("The Area of the triangle in sq in is "+area_ininches+" and sq cm is "+area);
    }
}
