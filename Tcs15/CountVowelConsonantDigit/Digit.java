package Tcs15.CountVowelConsonantDigit;

import java.util.*;

public class Digit {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    int v=0;
    int c=0;
    int d=0;

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            v++;
        }

        else if(Character.isDigit(s.charAt(i))){
            d++;
        }
        else{
            c++;
        }
    }
      System.out.println("Vowel : "+v);
        System.out.println("Consonant : "+c);
        System.out.println("Number : "+d);
}
}
