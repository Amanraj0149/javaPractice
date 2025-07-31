package IPA35.inter9;

import java.util.*;

public class kitab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] bb = new Book[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();
            sc.nextLine();

            bb[i]=new Book(a, b, c, d, e);
        }
         String title=sc.nextLine();
        Book[] ans1= fbm(bb);
        if(ans1!=null){
           for (int i = 0; i < ans1.length; i++) {
                System.out.println(ans1[i].getid()+" "+ans1[i].gettit());
            }
        }
        else{
            System.out.println("No Book found with mentioned attribute.");
        }

        //method 2;
        Book ans2= sbt(bb,title);
           if(ans2!=null) {
            System.out.println(ans2.getid());
            System.out.println(ans2.getpg());
           }
           else{
             System.out.println("No Book found with mentioned attribute");
           }
        sc.close();
    }

    public static Book[] fbm(Book[] bb){
        ArrayList<Book> ans= new ArrayList<>();
        double maxi=0.0;

        for(Book e:bb){
            if(e.getpr()>maxi){
                maxi=e.getpr();
            }
        }
        for(Book e:bb){
            if(e.getpr()==maxi)
                ans.add(e);
            }
           return ans.toArray(new Book[ans.size()]);
        }

        public static Book sbt(Book[] bb,String title){
            for(Book e: bb){
                if(e.gettit().equalsIgnoreCase(title)){
                    return e;
                }
            }
               return null;
        }
    }
    

class Book {
    private int id, pg;
    private String tit, aut;
    private double pr;

    public Book(int id, int pg, String tit, String aut, double pr) {
        this.id = id;
        this.pg = pg;
        this.tit = tit;
        this.aut = aut;
        this.pr = pr;
    }

    public int getid() {
        return id;
    }

    public int getpg() {
        return pg;
    }

    public String gettit() {
        return tit;
    }

    public String getaut() {
        return aut;
    }

    public double getpr() {
        return pr;
    }
}
