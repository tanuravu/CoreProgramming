package JavaMethods.Level1;
import java.util.Scanner;
public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int ans = handshakes(students);
        System.out.println("Possible Handshakes = "+ans);
    }
    public static int handshakes(int n){
        return (n*(n-1))/2;
    }
}
