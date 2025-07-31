package Anagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of String s1");
    String s1= sc.nextLine();
    System.out.println("Enter the value of String s2");
    String s2= sc.nextLine();

    s1=s1.replaceAll("\\s","").toLowerCase();
    s2=s2.replaceAll("\\s", "").toLowerCase();

 if(s1.length()!=s2.length()) System.out.println("String is not anagram");
 else
 {
   char ch1[]=s1.toCharArray();
   char ch2[]=s2.toCharArray();

   Arrays.sort(ch1);
   Arrays.sort(ch2);

   if(Arrays.equals(ch1,ch2)){
    System.out.println("String is anagram");
   }
   else
   {
     System.out.println("String is anagram");
   }
 }

}


//  if(s1.length()!=s2.length()) System.out.println("Strings are not Anagram ");
//  else{
//      char ch1[]= s1.toCharArray();
//     char ch2[]= s2.toCharArray();

//     Arrays.sort(ch1);
//      Arrays.sort(ch2);
//     if(Arrays.equals(ch1, ch2)){
//         System.out.println("Strings are Anagram ");
//     }
//     else{
//      System.out.println("Strings are not Anagram ");   
//     }
//  }
     




}
