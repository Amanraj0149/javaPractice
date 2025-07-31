package IPA35.inter4;

import java.util.*;

public class Col {
    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();sc.nextLine();
    College c[]=new College[n];
    for(int i=0;i<n;i++){
        int id=sc.nextInt();sc.nextLine();
        String name=sc.nextLine();
        int cn=sc.nextInt();sc.nextLine();
        String add=sc.nextLine();
        int pin=sc.nextInt();sc.nextLine();

        c[i]=new College(id, name, cn, add, pin);
    }
     
    String addn=sc.nextLine();

    College ans1= maxp(c);
    if(ans1!=null){
    System.out.println("id-"+ ans1.getid());
     System.out.println("name-"+ ans1.getname());
     System.out.println("cn-"+ ans1.getcn());
     System.out.println("add-"+ ans1.getadd());
     System.out.println("pin-"+ ans1.getpin());
    
    }
    else{
        System.out.println("No college found with mentioned attribute");
    }
    
    //mETHOD2
     College ans2=scd(c,addn);
     if(ans2!=null){
        System.out.println("id-"+ ans2.getid());
     System.out.println("name-"+ ans2.getname());
     System.out.println("cn-"+ ans2.getcn());
     System.out.println("add-"+ ans2.getadd());
     System.out.println("pin-"+ ans2.getpin());
     }
     else{
        System.out.println("No college found with mentioned attribute");
     }
      sc.close();
    }

 public static College maxp(College[] c){
     if (c == null || c.length == 0) return null;

    College maxCollege = c[0];
    for (int i = 1; i < c.length; i++) {
        if (c[i].getpin() > maxCollege.getpin()) {
            maxCollege = c[i];
        }
    }
    return maxCollege;
 }

   public static College scd(College[] c, String addn){
       
     for(int i=0;i<c.length;i++){
        if(c[i].getadd().equalsIgnoreCase(addn)){
          return c[i];
        }
     }

        return null;
    
   }

}

class College{
    private int id,cn, pin;
    private String name, add;

    public College(int id, String name, int cn, String add, int pin ){
        this.id=id;
        this.name=name;
        this.cn=cn;
        this.add=add;
        this.pin=pin;

    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getcn(){
        return cn;
    }
    public String getadd(){
        return add;
    }
    public int getpin(){
        return pin;
    }
}

