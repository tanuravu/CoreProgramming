package Array;
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five numbers:");
        for(int i=0;i<numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++) {
            if (numbers[i] == 0) {
                System.out.println(numbers[i] + " is Zero");
            } else if (numbers[i]>0 && numbers[i]%2==0) {
                System.out.println(numbers[i]+" is Positive and even");
                }else if(numbers[i]>0 && numbers[i]%2!=0){
                    System.out.println(numbers[i]+" is Odd");
                }else {
                System.out.println(numbers[i]+"  is Negative");
            }
        }
            if (numbers[0] == numbers[4]) {
                System.out.println("First and Last elements are equal");
            } else if (numbers[0] > numbers[4]) {
                System.out.println("First element is greater");
            } else {
                System.out.println("Last element is greater");
            }
        }
    }

