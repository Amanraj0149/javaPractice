package ReverseString;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of string");
        String s= sc.nextLine();
        StringBuffer s2= new StringBuffer(s);
        // s2.reverse();
        int i=0;
        int j=s2.length()-1;
        while(i<j){
           char temp= s2.charAt(i);
            s2.setCharAt(i, s2.charAt(j));
            s2.setCharAt(j, temp);
           i++;
           j--;

        }
        s=s2.toString();
        System.out.println(s);
        sc.close();
    }
}
