package IPA15.CharacterAtOddIndex;

import java.util.*;

public class odd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        
        for(int i=0;i<s.length();i++){
          if(i%2!=0){
            s1+=s.charAt(i);
          }
        }
        System.out.println(s1);

    }
}
