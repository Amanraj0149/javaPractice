package Tcs15.FindWordwithCapitalLetters;

import java.util.*;

public class f {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String[] arr= s.trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)>=65 && arr[i].charAt(0)<=90 ){
                System.out.println(arr[i]);
            }
        }
    }
}
