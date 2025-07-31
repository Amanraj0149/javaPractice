package Tcs15.LastCharacter;


import java.util.*;

public class LastChar {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String[] arr= s.trim().split("\\s+");
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i].charAt(arr[i].length()-1);
        }

        System.out.println(ans);
    }

}
