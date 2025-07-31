package IPA15.RemoveDuplicateCharacter;

import java.util.*;

public class remove {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();

      Set<Character> seen= new LinkedHashSet<>();
      for(char ch:s.toCharArray()){
        seen.add(ch);
      }

      for(char c:seen){
        System.out.print(c);
      }
    }
}
