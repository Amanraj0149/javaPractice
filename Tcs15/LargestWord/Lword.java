package Tcs15.LargestWord;

import java.util.*;

public class Lword {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String[] arr= s.trim().split("\\s+");
      
        String ans="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>ans.length()){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
    
}
