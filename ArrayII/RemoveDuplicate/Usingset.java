package ArrayII.RemoveDuplicate;

import java.util.HashSet;

public class Usingset {
    public static void main(String[] args) {

        int arr[]={1, 2, 2, 3, 4, 4, 4, 5, 5};
       HashSet<Integer> s= new HashSet<>();

       int idx=0;
      for(int i=0;i<arr.length;i++){
          if(!s.contains(arr[i])){
             s.add(arr[i]);
             arr[idx++]=arr[i];
          }
      }

      System.out.print(idx);
    }
}
