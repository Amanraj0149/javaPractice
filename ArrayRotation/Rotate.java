package ArrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
 
    static void rotate(int arr[],int s, int end){
        while(s<end){
            int temp=arr[s];
            arr[s]=arr[end];
            arr[end]=temp;
            s++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=7;
        int d=2;
        d=d%n;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       rotate(arr, d,n-1);
       rotate(arr, 0,d-1);
       rotate(arr,0,n-1);

       for(int i=0;i<n;i++){
          System.out.print(arr[i]+ " ");
       }
       sc.close();
       
    }
}
