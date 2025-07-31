package IPA15.NumberOfWord;

import java.util.*;

public class sentence {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         String s=sc.nextLine();
        String[] arr=s.trim().split("\\s");
        System.out.println(arr.length);
    }
}


// javac IPA15/NumberOfWord/sentence.java
// ava IPA15.NumberOfWord.sentence
