package IPA15.FirstLetterOfEachWord;
import java.util.*;
public class First {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    String s=sc.nextLine();
    String res="";
    res+=s.charAt(0);
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            res+=s.charAt(i+1);
        }
    }
    System.out.println(res);

  }
}
