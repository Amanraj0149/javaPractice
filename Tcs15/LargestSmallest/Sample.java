package Tcs15.LargestSmallest;


import java.util.*;

public class Sample {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number of integers:");
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        System.out.print("Enter integer"+ (i+1)+":");
        arr[i]=sc.nextInt();sc.nextLine();
       }

       Arrays.sort(arr);

       System.out.println(arr[n-1]);
       System.out.println(arr[0]);

    }
}
