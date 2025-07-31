package Tcs15.CountWordStartWithVowel;

import java.util.*;

public class ords {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        String s=sc.nextLine().toLowerCase();
        String[] ans=s.trim().split("\\s+");

        int count=0;

        for(int i=0;i<ans.length;i++){
          char d=ans[i].charAt(0);
          if(d=='a' || d=='e' || d=='i' || d=='o' || d=='u'){
             count++;
          }
        }

          System.out.println(count);
    }

    
}
