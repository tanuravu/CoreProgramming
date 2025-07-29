package Array;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        int[] ages=new int[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<ages.length;i++){
            System.out.println("Enter age of student: ");
            ages[i]=sc.nextInt();
            if(ages[i]<0){
                System.out.println("Invalid age");
            }else if(ages[i]>=18){
                System.out.println("Students with age "+ages[i]+" are eligible to vote");
            }else{
                System.out.println("Students with age "+ages[i]+" aren't eligible to vote");
            }
        }
    }
}
