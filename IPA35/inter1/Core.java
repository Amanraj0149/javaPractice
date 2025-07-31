package IPA35.inter1;
import java.util.*;

public class Core {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Course[] c = new Course[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String admin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();

            c[i] = new Course(id, name, admin, quiz, handson);
        }
        String search = sc.nextLine();
        int val = sc.nextInt();
       

        int avg = favg(c, search);
        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No Course found");
        }

        // method 2;
        Course[] ans2 = sortC(c, val);
        if (ans2 != null) {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getname());
            }
        } else {
            System.out.println("No course found with mentioned attribute.");
        }
        sc.close();
    }

    public static int favg(Course[] c, String search) {
        int avg = 0;
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i].getadmin().equalsIgnoreCase(search)) {
                avg += c[i].getquiz();
                count++;
            }
        }
        avg = avg / count;
        return avg;
    }

    //method 2
    public static Course[] sortC(Course[]c, int val){
        ArrayList<Course> ans=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i].gethandson()<val){
                ans.add(c[i]);
            }
        }
        if(ans.isEmpty()){
            return null;
        }

        for(int i=0;i<ans.size()-1;i++){
            for(int j=0;j<ans.size()-i-1;j++){
                if(ans.get(j).gethandson()>ans.get(j+1).gethandson()){
                    Course temp= ans.get(j);
                    ans.set(j,ans.get(j+1));
                    ans.set(j+1,temp);
                }
            }
        }

        return ans.toArray(new Course[ans.size()]);

    }

}

class Course {
    private int id;
    private String name;
    private String admin;
    private int quiz;
    private int handson;

    public Course(int id, String name, String admin, int quiz, int handson) {
        this.id = id;
        this.name = name;
        this.admin = admin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getadmin() {
        return admin;
    }

    public int getquiz() {
        return quiz;
    }

    public int gethandson() {
        return handson;
    }

}
