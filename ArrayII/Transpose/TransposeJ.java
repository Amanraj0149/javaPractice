package ArrayII.Transpose;

import java.util.Scanner;

public class TransposeJ {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int n=3;
        int arr[][]= new int[n][n];
       System.out.println("Enter 2d ele");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
          
         int brr[][]= new int[n][n];
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                brr[i][j]= arr[j][i];
            }
        }

        
          System.out.println("Printing Transpose");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              System.out.print(brr[i][j]+" ");
            }
            System.out.println();
            }
 sc.close();
 }
}


//javac ArrayII/Transpose/TransposeJ.java
//java ArrayII.Transpose.TransposeJ
