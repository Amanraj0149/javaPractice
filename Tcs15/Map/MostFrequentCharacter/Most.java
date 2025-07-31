package Tcs15.Map.MostFrequentCharacter;


import java.util.*;

public class Most {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         HashMap<Character,Integer> map= new HashMap<>();
         String s=sc.nextLine();
         for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
            char ans=' ';
            int maxi=0;
            for(char ch:map.keySet()){
                if(map.get(ch)>maxi){
                   ans=ch;
                   maxi=map.get(ch);
                }
            }

            System.out.println("Most frequent Character "+ ans+" "+ maxi);

    }
}
