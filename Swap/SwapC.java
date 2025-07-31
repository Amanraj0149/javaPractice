package Swap;

import java.util.Scanner;

public class SwapC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER 1");
        int a=sc.nextInt();
         System.out.println("ENTER THE NUMBER 2");
        int b=sc.nextInt();

        a= a+b;
        b=a-b;
        a=a-b;
       System.out.println(a+" "+ b);


    }
}
