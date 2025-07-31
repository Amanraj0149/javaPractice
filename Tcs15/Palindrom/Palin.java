package Tcs15.Palindrom;

import java.util.*;

public class Palin {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        int i=0;
        int j=s.length()-1;
        boolean check=true;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                check=false;
                break;
            }
           i++;
           j--;
        }
        if(check==true){
         System.out.println("palindrome");
        }
        else{
            System.out.println("None");
        }

     }
}
