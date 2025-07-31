package IPA15.SecondLargest;
import java.util.*;

public class Second {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>sl  && arr[i]!=l){
                sl=arr[i];
            }
        }
       System.out.println(l+" "+ sl);

    }
}
