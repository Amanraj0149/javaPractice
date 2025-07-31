package Tcs15.Map.MostFrequetWord;

import java.util.*;

public class Word {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        HashMap<String,Integer> map= new HashMap<>();
        String s= sc.nextLine();
        String[] arr= s.trim().split("\\s+");

        for(String word:arr){
           map.put(word,map.getOrDefault(word,0)+1);
        }
            
        String maxword="";
        int maxi=0;
        for(String w:map.keySet()){
            if(map.get(w)>maxi){
                maxi=map.get(w);
                maxword=w;
            }
        }
    System.out.println(maxword+":"+ maxi);
    }
}
