package Tcs15.CharacterAtOdd;

import java.util.*;

public class odd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();
        String ans="";

        for(int i=0;i<s.length();i++){
            if(i%2!=0){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
