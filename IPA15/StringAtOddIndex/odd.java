package IPA15.StringAtOddIndex;

import java.util.Scanner;

public class odd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String res="";
        char[] a= s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(i%2==1){
                res+=a[i];
            }
        }
        System.out.println(res);
    }
}
