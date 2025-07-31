package IPA35.inter10;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[4];
        for (int i = 0; i < emp.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            boolean e = sc.nextBoolean();
            sc.nextLine();

            emp[i] = new Employee(a, b, c, d, e);
        }
        String br = sc.nextLine();
        int ans1 = CountOfEmployee(emp, br);
        if (ans1 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println("No such Employees");
        }

        Employee ans2 = fes(emp);
        if (ans2 != null) {
            System.out.println(ans2.getId());
            System.out.println(ans2.getName());
        } else {
            System.out.println("All Employees using company transport");
        }
        sc.close();
    }

    public static int CountOfEmployee(Employee[] ans, String br) {
        int count = 0;
        for (Employee e : ans) {
            if (e.getBranch().equalsIgnoreCase(br)) {
                count++;
            }
        }
        return count;
    }

    public static Employee fes(Employee[] ans) {
        ArrayList<Employee> a = new ArrayList<>();
        for (Employee e : ans) {
            if (e.getTransport() == true) {
                a.add(e);
            }
        }
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - i - 1; j++) {
                if (a.get(j).getRating() > a.get(j + 1).getRating()) {
                    Employee temp = a.get(j + 1);
                    a.set(j + 1, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        if (a.size() >= 2)
            return a.get(a.size() - 2);
        else {
            return null;
        }
    }
}

class Employee {
    private int Id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int Id, String name, String branch, double rating, boolean transport) {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean getTransport() {
        return transport;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }
}