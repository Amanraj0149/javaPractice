class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
        String res="";
        for(int i=0;i<arr.length;i++){
          StringBuilder ans= new StringBuilder(arr[i]);
          ans.reverse();
          res+=ans.toString()+" ";
        }
        return res.trim();
    } 
}


// tc:-0(n)
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
         StringBuilder res= new StringBuilder();
        for(int i=0;i<arr.length;i++){                                                                        // aman ka naam 
           res.append(new StringBuilder(arr[i]).reverse()).append(" ");                                     // o/p: nama ak maan
        }
        return res.toString().trim();
    } 
}
