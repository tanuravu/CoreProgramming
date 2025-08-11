import java.util.Scanner;

public class InverseOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int inverse = 0;
        int position = 1;

        while (num != 0) {
            int digit = num % 10;
            inverse += position * Math.pow(10, digit - 1);
            num /= 10;
            position++;
        }

        System.out.println("Inverse of the number is: " + inverse);
    }
}
