package RemoveLeadZeros;

import java.util.Scanner;

public class Removez {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of string");
        String s1= sc.nextLine();
        int n=s1.length();

        int i=0;
          while(i<s1.length() && s1.charAt(i)=='0'){
            i++;
          }
        
          String rev= s1.substring(i);
         
           System.out.println(rev);
           sc.close();

          }

        }
        


