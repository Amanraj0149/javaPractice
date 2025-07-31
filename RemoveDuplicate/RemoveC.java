package RemoveDuplicate;

import java.util.Scanner;

public class RemoveC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
          System.out.println("Enter " + n + " sorted elements:");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }

        int rd=0;
        for(int i=1;i<n;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
            
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= rd; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
