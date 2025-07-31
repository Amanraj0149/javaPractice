package IPA35.NavalVessel;

import java.util.*;

public class threshold {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
           Naval[] n= new Naval[4];
           for(int i=0;i<4;i++){
            int a=sc.nextInt();sc.nextLine();
             String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            String e=sc.nextLine();
        
         n[i]=new Naval(a, b, c, d, e);
           }

      int para=sc.nextInt();sc.nextLine();
      String purp=sc.nextLine();

      int ans1=fav(n,para);
      if(ans1>0){
        System.out.println(ans1);
      }
      else{
         System.out.println("No Naval Vessel is available with the specified purpose");
      }
        
      //
      Naval ans2= fvg(n,purp);
       if(ans2!=null){

        for(int i=0;i<ans2.length;i++){
            int per=ans2[i].getnc()*100/ans2[i].getnp();
            if(per==100){
                System.out.println(ans1[i].getNmae()+"%star")
            }
        }
       }















    }
}

class Naval{
    private int id,np,nc;
    private String name,pur;


    public Naval(int id, String name, int np, int nc,String pur){
         this.id=id;
         this.name=name;
         this.np=np;
         this.nc=nc;
         this.pur=pur;
    }

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public int getnp(){
        return np;
    }
    public int getnc(){
        return nc;
    }
    public String getpur(){
        return pur;
    }

    public void setpur( String pur){
        this.pur=pur;
    }



}