package IPA35.inter15;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] p = new Phone[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String os = sc.nextLine();
            String br = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            p[i] = new Phone(i, os, br, price);
        }

        String b = sc.nextLine();
        String o = sc.nextLine();

        int ans1 = fpg(p, b);
        if (ans1 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println("The given Brand is not available");
        }

        //
        Phone ans2 = gpb(p, o);
        if (ans2 != null) {
                System.out.println(ans2.getid());

        } else {
            System.out.println("No phones are available with specified os and price range");
        }

        sc.close();
    }

    public static int fpg(Phone[] p, String b) {
        int sum = 0;
        for (Phone e : p) {
            if (e.getbr().equalsIgnoreCase(b)) {
                sum += e.getpr();
            }
        }
        if (sum > 0) {
            return sum;
        }
        return 0;
    }
    //

    public static Phone gpb(Phone[] p, String o) {
        for (Phone e : p) {
            if (e.getos().equalsIgnoreCase(o) && e.getpr() >= 50000) {
              return e;
            }
        }
        return null;
    }

}

class Phone {

    private int id, pr;
    private String os, br;

    public Phone(int id, String os, String br, int pr) {
        this.id = id;
        this.os = os;
        this.br = br;
        this.pr = pr;
    }

    public int getid() {
        return id;
    }

    public String getos() {
        return os;
    }

    public String getbr() {
        return br;
    }

    public int getpr() {
        return pr;
    }
}
