package IPA15.ReverseTheWordInString;


import java.util.*;

public class Rwords {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      String s=sc.nextLine();

      String ans="";
      String[] arr=s.trim().split("\\s+");
      for(int i=arr.length-1;i>=0;i--){
        ans+=arr[i]+ " ";
      }

      System.out.println(ans);

    }
}
