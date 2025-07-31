package Palindrome;

import java.util.Scanner;

// class Pal{
//     public Boolean Palind(char arr[], int n){
//         int start=0;
//         int end=n;
//         while(start<end){
//             if(arr[start]!=arr[end]) return false;
//             start++;
//             end--;
//         }
//         return true;
//     }
// }

public class Palin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of string");
        String s= sc.nextLine();

        int start=0;
        int end= s.length()-1;
        int n= s.length()-1;

        char[] ch= s.toCharArray();

        while(start<end){
            if(ch[start]!=ch[end]) System.out.println("False");
            start++;
            end--;
        }
       System.out.println("True");

    //    Pal p= new Pal();
    //    Boolean res= p.Palind(ch,n);
    //    System.out.println(res);
         
    }
}
