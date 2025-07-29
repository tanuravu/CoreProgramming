package Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int[] table= new int[10];
        for(int i=0;i<table.length;i++){
            table[i]=num*(i+1);
            System.out.println(num+"*"+(i+1)+"="+table[i]);
        }
    }
}
