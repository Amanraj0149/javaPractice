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
