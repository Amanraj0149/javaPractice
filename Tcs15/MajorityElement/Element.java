package Tcs15.MajorityElement;

import java.util.*;


public class Element {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    HashMap<Integer, Integer> m = new HashMap<>();
    int n=sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        m.put(arr[i],m.getOrDefault(arr[i],0) +1 );

    }

    for(int key:m.keySet()){
        if(m.get(key)>n/2){
             System.out.println("Majority element: " + key);
                return;
        }
    }
     System.out.println("No Majority Element");


}
}
