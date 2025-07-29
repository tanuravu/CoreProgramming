package Array;

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Invalid Input");return;
        }
        int size=(n/2)+1;
        int[] even =new int[size];
        int[] odd=new int[size];
        int evenIndex=0;int oddIndex=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[evenIndex]=i;
                evenIndex++;
            }else{
                odd[oddIndex]=i;
                oddIndex++;
            }
        }
        System.out.println("Even Number");
        for(int i=0;i<evenIndex;i++){
            System.out.println(even[i]+" ");
        }
        System.out.println("Odd Number: ");
        for(int i=0;i<oddIndex;i++){
            System.out.println(odd[i]+" ");
        }
    }
}
