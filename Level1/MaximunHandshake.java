package Methods;
import java.util.Scanner;

public class MaximunHandshake {
    public static int handshake(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = handshake(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }

}
