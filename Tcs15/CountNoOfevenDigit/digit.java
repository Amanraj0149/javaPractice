package Tcs15.CountNoOfevenDigit;


import java.util.*;

public class digit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                count++;
            }
            n=n/10;
        }
        if(count>=3){
             System.out.print("True");
        }
        else{
             System.out.print("False");
        }
    }
}
