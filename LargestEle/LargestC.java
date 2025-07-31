package LargestEle;

import java.util.Scanner;

public class LargestC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
         System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        
        System.out.println(maxi);
        sc.close();
    }
}
