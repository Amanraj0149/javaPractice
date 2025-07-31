package IPA15.NoOfWordInSentence;

import java.util.Scanner;

public class word {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         String s = sc.nextLine();
        
        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Edge case: if the input is empty or just spaces
        if(s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(words.length);
    } 
}
}
