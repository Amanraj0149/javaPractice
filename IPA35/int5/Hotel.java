package IPA35.int5;

import java.util.*;
public class Hotel {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
    Motel[] m= new Motel[4];
    for(int i=0;i<4;i++){
        int id=sc.nextInt();sc.nextLine();
        String name=sc.nextLine();
        String db=sc.nextLine();
        int nr=sc.nextInt();sc.nextLine();
        String cab=sc.nextLine();
        double tb=sc.nextDouble();sc.nextLine();

        m[i]= new Motel(id, name, db, nr, cab, tb);
    }
       String p=sc.next();

       int ans=tnb(m,p);
       if ( ans>0 ) {
          System.out.println(ans);
       }
       else{
        System.out.println("No such rooms booked");
       }
       sc.close();
    }


    public static int tnb(Motel[] m , String p){
        int count=0;
        for(int i=0;i<m.length;i++){
   if(m[i].getcab().trim().equalsIgnoreCase(p.trim()) && m[i].getnr()>5){  
            count+= m[i].getnr();
            }
        }
        return count;
    }

}
class Motel{
    private int id, nr;
    private String name,db, cab;
    private double tb;

    public Motel(int id, String name, String db, int nr, String cab, double tb){
        this.id=id;
        this.name=name;
        this.db=db;
        this.cab=cab;
        this.tb=tb;
    }

public int getid(){
    return id;
}
public String getname(){
    return name;
}
public String getdb(){
    return db;
}

public int getnr(){
    return nr;
}
public String getcab(){
    return cab;
}
public double gettb(){
    return tb;
}

}
   

