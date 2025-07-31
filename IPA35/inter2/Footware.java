package IPA35.inter2;

import java.util.*;

public class Footware {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    Foot[] f= new Foot[5];

    for(int i=0;i<5;i++){
      int id=sc.nextInt();sc.nextLine();
      String name=sc.nextLine();
      String type=sc.nextLine();
      int price=sc.nextInt(); sc.nextLine(); 

      f[i]=new Foot(id, name, type, price);
    }

    String t=sc.nextLine();
    String brand=sc.nextLine();
     
    

    int ans1=getcount(f,t);
    if(ans1!=0){
        System.out.println(ans1);
    }
    else{
        System.out.println("Footwear not available");
    }

    Foot ans2= getSecondHigh(f,brand);
     if (ans2 != null) {
            System.out.println(ans2.getid());
            System.out.println(ans2.getname());
            System.out.println(ans2.getprice());
        } else {
            System.out.println("Brand not available");
        }

        sc.close();
}

    public static int getcount(Foot[] f, String t){
        int count=0;
        for(int i=0;i<f.length;i++){ 
            if(f[i].gettype().equalsIgnoreCase(t)){
                count++;
            }
        }
        return count;
    }

    public static Foot getSecondHigh(Foot[] f, String brand){
         ArrayList<Foot> ans=new ArrayList<>();

         for(int i=0;i<f.length;i++){
            if(f[i].getname().equalsIgnoreCase(brand)){
                ans.add(f[i]);
            }
         }
         
         for(int i=0;i<ans.size()-1;i++){
            for(int j=0;j<ans.size()-i-1;j++){
                if(ans.get(j).getprice()> ans.get(j+1).getprice()){
                 Foot temp=ans.get(j);
                 ans.set(j,ans.get(j+1));
                 ans.set(j+1,temp);
                }
            }
         }
         if(ans.size() >= 2){
            return ans.get(ans.size() - 2); // Second highest
        } else {
            return null;
        }
    }



}

class Foot{
    private int id, price;
    private String name, type;
  

    public Foot(int id,String name,String type,int price){
        this.id=id;
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public int getprice(){
        return price;
    }

}