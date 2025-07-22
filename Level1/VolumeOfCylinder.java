import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double pie=3.14;
        System.out.println("Radius: ");
        int radius=sc.nextInt();
        System.out.println("Height: ");
        int height=sc.nextInt();
        double volume= pie*radius*radius*height;
        System.out.println("Volume: "+volume);
    }
}
