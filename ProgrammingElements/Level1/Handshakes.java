package ProgrammingElements.Level1;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int n=sc.nextInt();
        int handshakes=(n*(n-1)/2);
        System.out.println("Number of HandShakes: "+handshakes);
    }
}
