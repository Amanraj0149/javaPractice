package IPA35.inter13;

import java.util.*;

public class Cars {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      Car[] c= new Car[4];
      for(int i=0;i<4;i++){
        int a=sc.nextInt();sc.nextLine();
        String b=sc.nextLine();
        int d=sc.nextInt();sc.nextLine();
        int e=sc.nextInt();sc.nextLine();
        String f=sc.nextLine();
    
        c[i]=new Car(i, b, d, e, f);
      }
         String en=sc.nextLine();

         String bra=sc.nextLine();

         int ans1=fte(c,en);
            if(ans1!=0){
            System.out.println(ans1);
         }
         else{
            System.out.println("Not found");
         }

      Car[] ans2= ucg(c,bra);
      if(ans2!=null){

        
         for(int i=0;i<ans2.length;i++){
          int gr=ans2[i].getnp()*100/ans2[i].getnt();
          if(gr>80){
            System.out.println(ans2[i].getbr()+ "A1");
          }
          else{
            System.out.println(ans2[i].getbr()+"::B2");
          }
         }
      }
      else{
        System.out.println("No Car is available with the specified brand");
      }
 sc.close();
    }

    public static int fte(Car[] c,String s){
        int count=0;
        for(Car e:c){
            if(e.getenv().equalsIgnoreCase(s)){
           count+=e.getnp();
            }
        }
        if(count>0){
            return count;
        }
        return 0;
    }

    public static Car[] ucg(Car[] c,String bra){
        ArrayList<Car> ans=new ArrayList<>();
        for(Car e:c){
            if(e.getbr().equalsIgnoreCase(bra)){
                ans.add(e);
            }
        }
        if(ans.size()>0){
            return ans.toArray(new Car[ans.size()]);
        }
        return null;
    }
}

class Car{

    private int id,nt,np;
    private String br,env;

    public Car(int id, String br, int nt, int np,String env){
        this.id=id;
        this.env=env;
        this.np=np;
        this.nt=nt;
        this.br=br;
    }
    public int getid(){
        return id;
    }

    public String getbr(){
        return br;
    }
    public int getnt(){
        return nt;
    }

    public int getnp(){
        return np;
    }
    public String getenv(){
        return env;
    }
}
