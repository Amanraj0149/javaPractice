package BinarySearch;

import java.util.Scanner;

public class Binary {

     static int BinarySearch(int []arr, int lo, int hi, int x){
       while(lo<=hi){
        int mid= lo+(hi-lo)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
       }
       return -1;
     }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=7;
        int target=7;
       int arr[]= new int[n];
       System.out.println("Enter the array elements");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

     int res= BinarySearch(arr, 0, n-1, target);

      if(res==-1)
      System.out.println("Element is not present in array");
      else
      {
        System.out.println(res);
      }

       
    }
}
