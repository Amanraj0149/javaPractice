package ArrayII;

import java.util.Scanner;
import java.util.*;

public class AddEle {
 static int[] addx(int n, int[] arr, int x){

    int num[]=new int[n+1];

    for(int i=0;i<n;i++){
        num[i]=arr[i];
        num[n]=x;
    }
    return num;
 }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       int n=5;
       int arr[]= new int[n];
       int x=70;
        System.out.println("eneter array elements");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

       arr= addx(n,arr,x);
       System.out.println(Arrays.toString(arr));
    }
}
