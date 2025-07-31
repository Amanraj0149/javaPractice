package Tcs15.NoOfWordPresentInSentence;

import java.util.*;

public class Nword {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
         String ch=sc.nextLine();
         int count=0;
        String[] arr=s.trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
           if(arr[i].equalsIgnoreCase(ch)){
             count++;
           }
        }
        System.out.println(count);
    }
}
