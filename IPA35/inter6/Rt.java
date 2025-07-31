package IPA35.inter6;

import java.util.*;

public class Rt {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
      RRT[] arr= new RRT[4];
      for(int i=0;i<4;i++){
        int no=sc.nextInt();sc.nextLine();
        String r=sc.nextLine();
        String at=sc.nextLine();
        int pr=sc.nextInt();sc.nextLine();
        String pro=sc.nextLine();

        arr[i]=new RRT(no, r, at, pr, pro);
      }
       
      String req=sc.nextLine();

       RRT ans= maxp(arr,req);
       if(ans!=null){
        System.out.println(ans.getno());
        System.out.println(ans.getr());
        System.out.println(ans.getat());
       }
       else{
        System.out.println("No such Ticket");
       }
       sc.close();
    }
    public static RRT maxp(RRT[] ans, String r){
        RRT min=null;
        for(int i=0;i<ans.length;i++){
            if(ans[i].getpro().equalsIgnoreCase(r)){
              if(min==null || ans[i].getpr()< min.getpr()){
               min=ans[i];
              }
            }
        }
        return min;
    }
}

class RRT{

    private int no,pr;
    private String r,at,pro;

    public RRT(int no,String r,String at, int pr, String pro){
        this.no=no;
        this.r=r;
        this.at=at;
        this.pr=pr;
        this.pro=pro;
    }
 
    public int getno(){
        return no;
    }

    public String getr(){
        return r;
    }

     public String getat(){
        return at;
    }
     public String getpro(){
        return pro;
    }


     public int getpr(){
        return pr;
    }

}
