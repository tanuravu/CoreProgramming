package JavaStrings.Level1;

import java.util.Scanner;

public class Q1CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String str1 = sc.next();
        System.out.println("Enter 2nd String:");
        String str2 = sc.next(); 
        boolean comparebyCharAt = compare(str1,str2);
        boolean comparebyequal = str1.equals(str2);
        if(comparebyCharAt == comparebyequal){
            System.out.println("Both method gives same ans:"+comparebyCharAt);
        }
        else{
            System.out.println("Both method differ in comparing Strings");
        }
    }
    public static boolean compare(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) return false;
        }
        return true;
    }
}
