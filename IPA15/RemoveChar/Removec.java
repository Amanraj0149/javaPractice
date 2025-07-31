package IPA15.RemoveChar;

import java.util.Scanner;

public class Removec {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String c= sc.nextLine();
       String res=s.replace(c,"");
       System.out.println(res);
    }
}
