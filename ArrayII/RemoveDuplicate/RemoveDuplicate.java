package ArrayII.RemoveDuplicate;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          int n=9;
        int arr[]=new int[9];
       
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int rd=0;
        for(int i=1;i<n;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }

      System.out.println("Array after removing duplicates:");
        for(int i = 0; i <= rd; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
