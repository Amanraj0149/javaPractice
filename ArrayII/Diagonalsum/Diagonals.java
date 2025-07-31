package ArrayII.Diagonalsum;

import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     int n=3;
        int arr[][]= new int[n][n];
       System.out.println("Enter 2d ele");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();  }
            }

           int sum=0;
           int antidiagonalsum=0;
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                sum+= arr[j][i];
                if(i+j==n-1)
                antidiagonalsum+=arr[i][j];
        }
           System.out.println(sum);
            System.out.println(antidiagonalsum);
    }
}

}

// javac ArrayII/Diagonalsum/Diagonals.java
// java ArrayII.Diagonalsum.Diagonals 
