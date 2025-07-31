package RemoveOcuurence;

import java.util.Scanner;

public class RemoveC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=1;
       
        int ro=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=key){
                arr[ro]=arr[i];
                ro++;
            }
        }

        for(int i=0;i<ro;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
