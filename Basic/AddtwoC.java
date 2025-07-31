import java.util.Scanner;

class Sum{
  public int add(int a, int b){
  return a+b;
  }
}


public class AddtwoC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         Sum s1= new Sum();
         int a= sc.nextInt();
         int b=sc.nextInt();
        int res= s1.add(a,b);
         System.out.println(res);
    }
}
