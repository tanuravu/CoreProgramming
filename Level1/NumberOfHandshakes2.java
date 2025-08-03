package JavaMethods.Level1;

import java.util.Scanner;

public class NumberOfHandshakes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int handshakes = (n*(n-1))/2;
        System.out.println("Possible Handshakes "+ handshakes);
    }
}
