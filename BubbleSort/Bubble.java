package BubbleSort;

import java.util.Scanner;

class BubbleSort{

    void bubble(int[] arr){
        int n=arr.length;
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[i]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       
      }
    }


}

public class Bubble {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=4;
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      BubbleSort ob= new BubbleSort();
      ob.bubble(arr);
       for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
