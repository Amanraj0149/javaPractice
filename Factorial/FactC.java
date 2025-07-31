package Factorial;

import java.util.Scanner;

class Fact{
     public int Factorial(int num){
        if(num<=1) return 1;
       return num * Factorial(num-1);
     }
}

public class FactC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int a= sc.nextInt();
        Fact F1= new Fact();
       int res= F1.Factorial(a);
        System.out.println("Factorial of " + a + " is: " + res);

    }
}
