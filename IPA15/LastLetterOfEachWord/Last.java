package IPA15.LastLetterOfEachWord;

import java.util.*;


public class Last {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     String s=sc.nextLine();
     String res="";
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
         res+=s.charAt(i-1);
        }
     }
     System.out.print(res+ s.charAt(s.length()-1) );
     
    }
}
