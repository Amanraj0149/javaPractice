package IPA15.NoOfEvenDigit;

import java.util.Scanner;

public class even {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String s= String.valueOf(n);
    char []c= s.toCharArray();
    int count=0;

    for(int i=0;i<c.length;i++){
        int num=c[i]-'0';
        if(num%2==0){
            count++;
        }
    }
    System.out.println(count);
  }
}
