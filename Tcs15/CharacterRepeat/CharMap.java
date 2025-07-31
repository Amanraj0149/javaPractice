package Tcs15.CharacterRepeat;

import java.util.*;

public class CharMap {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       HashMap<Character,Integer> map= new HashMap<>();

       String s=sc.nextLine();

       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
 
       for(char ch:map.keySet()){
        System.out.print(""+ch + map.get(ch));
       }
    }
}

