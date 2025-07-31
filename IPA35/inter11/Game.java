package IPA35.inter11;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] p = new Player[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            p[i] = new Player(a, b, c, d);
        }
         
       String skill=sc.nextLine();
       String level=sc.nextLine();
      int ans1= fps(p,skill);
      if(ans1!=0){
        System.out.println(ans1);
      }
      else{
         System.out.println("The given Skill is not available");
      }

      // method 2

      Player ans2= gpl(level,skill,p);
      if(ans2!=null){
         System.out.println(ans2.getId());
      }
      else{
        System.out.println("No player is available with specified level, skill \r\n" + //
                        "and eligibility points");
      }
     sc.close();
    }

public static int fps(Player[] p, String s) {
    int sum=0;
    for(Player e: p){
        if(e.getsk().equalsIgnoreCase(s)){
            sum+=e.getpo();
        }
    }
    return sum;
}

public static Player gpl ( String l, String s, Player[] p){
    for(Player e:p){
        if(e.getlv().equalsIgnoreCase(l) && e.getsk().equalsIgnoreCase(s) && e.getpo()>=20){
                return e;
        }
    }
    return null;
}

}

class Player {
    private int id, po;
    String sk, lv;

    public Player(int id, String sk, String lv, int po) {
        this.id = id;
        this.sk = sk;
        this.lv = lv;
        this.po = po;
    }

    public int getId() {
        return id;
    }

    public String getsk() {
        return sk;
    }

    public String getlv() {
        return lv;
    }

    public int getpo() {
        return po;
    }

}
