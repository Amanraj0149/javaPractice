package IPA35.inter14;

import java.util.*;

public class Film {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     Movie[] m=new Movie[4];
     for(int i=0;i<4;i++){
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        int d=sc.nextInt();sc.nextLine();

        m[i]= new Movie(a, c, c, d);
     }
  String s=sc.nextLine();
   
  Movie[] ans= gmg(m,s);
  if(ans!=null){
     for(Movie e:ans){
        if(e.getbud()>80000000){
            System.out.println("High Budget Movie");
        }
        else{
             System.out.println("Low Budget Movie");
        }
     }
  }
  else{
    System.out.println("Not found");
  }

sc.close();
    }

public static Movie[] gmg(Movie[] m,String s){
    ArrayList<Movie> arr= new ArrayList<>();
    for(Movie e:m){
        if(e.getgen().equalsIgnoreCase(s)){
            arr.add(e);
        }
    }
    if(arr.size()>0){
        return arr.toArray(new Movie[arr.size()]);
    }
    return null;
}

}

class Movie{

    private String name,com, gen;
    private int bud;

    public Movie(String name,String com, String gen,int bud){
        this.name=name;
        this.com=com;
        this.gen=gen;
        this.bud=bud;
    }

    public String getname(){
        return name;
    }
     public String getcom(){
        return com;
    }
     public String getgen(){
        return gen;
    }
     public int getbud(){
        return bud;
    }

}
