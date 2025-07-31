package IPA15.AverageLimit;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int sum=0;
        int l1=sc.nextInt();
        int l2=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]>l1 && arr[i]<l2){
                sum+=arr[i];
                count++;
            }
        }
         System.out.println(sum/count);
    }
}
