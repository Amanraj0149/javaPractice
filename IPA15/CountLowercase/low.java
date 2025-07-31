package IPA15.CountLowercase;

import java.util.*;

public class low {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='a' && c[i]<='z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
