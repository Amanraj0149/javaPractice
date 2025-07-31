package ArraySum;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> l1= new ArrayList<>();

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            l1.add(x);
        }
        int sum=0;
        for(int num:l1){
            sum+=num;
        }

         System.out.println("ArrayList elements: " + l1);
         System.out.println("Sum of elements: " + sum);
        sc.close();
    }
}
