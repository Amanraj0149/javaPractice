package Tcs15.Armstrong;

import java.util.*;

public class Arm {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int sum=0;
      for(int i=0;i<s.length();i++){
        int digit=s.charAt(i)-'0';
        sum+=Math.pow(digit,s.length());
      }
      String ans=Integer.toString(sum);
      if(s.equals(ans)){
          System.out.println("Yes, the number is an Armstrong number.");
      }
      else{
         System.out.println("No, the number is not an Armstrong number.");
      }
    }
}


 // Count the number of digits
 // int digits = String.valueOf(num).length();