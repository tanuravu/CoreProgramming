package Level2;

import java.util.Scanner;

public class UnitPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unitPrice = input.nextInt();
        int quantity = input.nextInt();
        int price = unitPrice*quantity;
        System.out.println("The total purchase price is INR "+price+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
