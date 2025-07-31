package Tcs15.UpperCase;

import java.util.*;

public class CountUpper {
  public static void main(String[] args)   {
   Scanner sc= new Scanner(System.in);
 
   String s= sc.nextLine();

   int count=0;
   for(int i=0;i<s.length();i++){
    if(s.charAt(i)>=65 && s.charAt(i)<=90){
        count++;
    }
   }
   System.out.println(count);


  }
}
