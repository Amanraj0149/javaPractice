package IPA35.inter3;

import java.util.*;

public class Boy {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    Stud[] s=new Stud[4];
    for(int i=0;i<4;i++){
      int roll=sc.nextInt();sc.nextLine();
        String name=sc.nextLine();
        String branch=sc.nextLine();
      double score= sc.nextDouble();sc.nextLine();
      boolean day=sc.nextBoolean();sc.nextLine();

    s[i]=new Stud(roll, name, branch, score, day);
    }


    int ans1=fcd(s);
    if(ans1!=0){
        System.out.println(ans1);
    }
    else
    {
        System.out.println("There are no such dayscholar students");
    }
       
    Stud ans2=fss(s);
    if(ans2!=null){
         System.out.println(ans2.getroll());
         System.out.println(ans2.getname());
         System.out.println(ans2.getscore());

    }
    else{
        System.out.println("There are no student from non day scholar");
    }
     sc.close();
    }

    public static int fcd(Stud[] s){
        int count=0;
        for(int i=0;i<s.length;i++){
            if(s[i].getscore()>80 && s[i].getday()==true){
                count++;
            }
        }
        return count;
    }

    public static Stud fss(Stud[] s){
       ArrayList<Stud> ans2= new ArrayList<>();
         for(int i=0;i<s.length;i++){
            if(s[i].getday()==false){
                ans2.add(s[i]);
            }
         }
            
         for(int i=0;i<ans2.size()-1;i++){
             for(int j=0;j<ans2.size()-i-1;j++){
                if(ans2.get(j).getscore()>ans2.get(j+1).getscore()){
                    Stud temp=ans2.get(j+1);
                    ans2.set(j,ans2.get(j+1));
                    ans2.set(j+1,temp);
                }
             }
            }

             if(ans2.size()>=2){
                return ans2.get(ans2.size()-2);
             }
             else{
                return null;
             }

    }



}
class Stud{

private int roll;
private String name;
private String branch;
private double score;
private boolean day;

public Stud(int roll,String name, String branch, double score, boolean day){
    this.roll=roll;
    this.name=name;
    this.branch=branch;
    this.score=score;
    this.day=day;
}

public int getroll(){
    return roll;
}
public String getname(){
    return name;
}

public double getscore(){
    return score;
}
public boolean getday(){
    return day;
}




}