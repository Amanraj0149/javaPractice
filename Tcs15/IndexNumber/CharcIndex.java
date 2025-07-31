package Tcs15.IndexNumber;

import java.util.*;

public class CharcIndex {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);

        int c=0;
        boolean check=false;

    for(int i=0;i<s.length();i++){
         if(s.charAt(i)==ch){
            c=i;
            check=true;
            break;
         }
    }
    if(check==true){
        System.out.println(c);
    }
    else{
         System.out.println("Na");
    }
}
}
