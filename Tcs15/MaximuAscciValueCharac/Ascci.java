package Tcs15.MaximuAscciValueCharac;

import java.util.*;

public class Ascci {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();
    char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
          if(ch<s.charAt(i)){
            ch=s.charAt(i);
          }
        }
        System.out.println(ch);
}
}
