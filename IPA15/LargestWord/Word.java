package IPA15.LargestWord;

import java.util.*;

public class Word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String largest="";
        String[] arr=s.trim().split("\\s");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>largest.length()){
            largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}

// javac IPA15/LargestWord/Word.java
// java IPA15.LargestWord.Word