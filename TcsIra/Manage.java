package TcsIra;

import java.util.*;

class Theatre{

    private int num;
    private String name;
    private int capacity;
    private int rating;
    private String type;


    public Theatre(int num,String name,int capacity,int rating, String type){
        this.num=num;
        this.name=name;
        this.capacity=capacity;
        this.rating=rating;
        this.type=type;
    }

    public int getnum(){
        return num;
    }
    public String getname(){
        return name;
    }
    public int getcapacity(){
        return capacity;
    }
    public int getrating(){
        return rating;
    }
    public String  gettype(){
        return type;
    }



}
public class Manage {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Theatre []t=new Theatre[4];
    for(int i=0;i<4;i++){
        int num=sc.nextInt();sc.nextLine();
        String name=sc.nextLine();
        int capacity=sc.nextInt();sc.nextLine();
        int rating=sc.nextInt();sc.nextLine();
        String type=sc.nextLine();

        t[i]=new Theatre(num, name, capacity,rating,  type);
    }
       int tnum=sc.nextInt();sc.nextLine();
       String ttype=sc.nextLine();

       sc.close();

       int tcap= Theatrecap(t,tnum);
       if(tcap>0){
        System.out.println(tcap);
       }
       else{
        System.out.println("Theatre Number is incorrect");
       }

       Theatre secondlow= Secondlowest(t,ttype);
       if(secondlow!=null){
        System.out.println(secondlow.getname());
        System.out.println(secondlow.getrating());
       }
       else{
        System.out.println("No such Theatre");
       }

    }

       public static int Theatrecap(Theatre[] t,int tnum){
        int cap=0;
         for(Theatre m:t){
            if(m.getnum()==tnum){
                cap= m.getcapacity();
            }
         }
         return cap;
       }

         public static Theatre Secondlowest(Theatre[] t, String ttype) {
         List<Theatre> slow=new ArrayList<>();
          for(Theatre m:t){
            if(m.gettype().equalsIgnoreCase(ttype)){
                slow.add(m);

            }
        }
             if(slow.size()<2){ return null;
        }
            slow.sort(Comparator.comparingInt(Theatre:: getrating));

          return slow.get(1);

    }  
}
