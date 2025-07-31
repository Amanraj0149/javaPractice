package IPA35.inter8;

import java.util.*;

public class Hotels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] h = new Hotel[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String dob = sc.nextLine();
            int nb = sc.nextInt();
            sc.nextLine();
            String wf = sc.nextLine();
            double tb = sc.nextDouble();
            sc.nextLine();

            h[i] = new Hotel(id, name, dob, nb, wf, tb);
        }

        String req = sc.nextLine();
        String wifi = sc.nextLine();

        // method1;
        int ans1 = nrb(h, req);
        if (ans1 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println("No rooms booked in the given month");
        }

        // method2
        Hotel ans2 = shf(h, wifi);
        if (ans2 != null) {
            System.out.println(ans2.getid());
        } else {
            System.out.println("No such option available");
        }
        sc.close();
    }

    public static int nrb(Hotel[] h, String r) {
        int count = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i].getdob().contains(r)) {
                count += h[i].getnb();
            }
        }
        return count;
    }

    public static Hotel shf(Hotel[] h, String wifi) {
        ArrayList<Hotel> ans = new ArrayList<>();
        for (Hotel e : h) {
            if (e.getwf().equalsIgnoreCase(wifi)) {
                ans.add(e);
            }
        }

        for (int i = 0; i < ans.size() - 1; i++) {
            for (int j = 0; j < ans.size() - i - 1; j++) {
                if (ans.get(j).gettb() > ans.get(j + 1).gettb()) {
                    Hotel temp = ans.get(j + 1);
                    ans.set(j + 1, ans.get(j));
                    ans.set(j, temp);
                }
            }
        }

        if (ans.size() >= 2) {
            return ans.get(ans.size() - 2);
        } else {
            return null;
        }
    }
}

class Hotel {
    private int id, nb;
    private String name, dob, wf;
    private double tb;

    public Hotel(int id, String name, String dob, int nb, String wf, double tb) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.nb = nb;
        this.wf = wf;
        this.tb = tb;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getdob() {
        return dob;
    }

    public int getnb() {
        return nb;
    }

    public String getwf() {
        return wf;
    }

    public double gettb() {
        return tb;
    }

}
