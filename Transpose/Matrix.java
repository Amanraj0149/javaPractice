package Transpose;

import java.util.Scanner;

public class Matrix {

     static void transpose(int arr[][], int brr[][]){
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
            brr[i][j]=arr[j][i];
          }
        }
     }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][]=new int[3][3];
        int brr[][]=new int[3][3];
         
        System.out.println("Enter the value of matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        transpose(arr, brr);
        System.out.println("Result matrix is \n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(brr[i][j]+ " ");
            }
             System.out.println();
        }
           sc.close();
    }
}
