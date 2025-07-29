package Array;

import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        double[] values= new double[10];
        double total=0.0;
        int index=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        while(true){
            if(index==10) break;
            double num= sc.nextDouble();
            if(num<=0) break;
            values[index++]=num;
        }
        for(int i=0;i<index;i++){
            total+=values[i];
        }
        System.out.println("Sum of numbers: "+total);
    }
}
