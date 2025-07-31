package ArrayII;

import java.util.Scanner;
import java.util.*;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        int arr[][]= new int[n][n];
       System.out.println("Enter 2d ele");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Dusra tarika");
    }
}
