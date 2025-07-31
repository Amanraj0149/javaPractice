package IPA35.inter7;

import java.util.*;
public class Simm {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Sim[] s = new Sim[5];
        for (int i = 0; i < s.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            s[i]=new Sim(a,b,c,d,e);
        }
    
    String req=sc.nextLine();
    String req2=sc.nextLine();

    Sim[] arr= tcc(s,req,req2);
    if(arr!=null){
         for (int i = arr.length-1; i >=0; i--) {
                System.out.println(arr[i].getSimId()+" "+arr[i].getCustomerName()+" "+arr[i].circle+" "+arr[i].getRatePerSecond());
            }
    }
       sc.close();
    }
     public static Sim[] tcc(Sim[]s, String c1, String c2){
        ArrayList<Sim> ans=new ArrayList<>();
         for(Sim e:s){
            if(e.getCircle().equalsIgnoreCase(c1)){
                e.setCircle(c2);
                ans.add(e);
            }
         }

         for(int i=0;i<ans.size()-1;i++){
            for(int j=0;j<ans.size()-i-1;j++){
                if(ans.get(j).getRatePerSecond()>ans.get(j+1).getRatePerSecond()){
                  Sim temp=ans.get(j+1);
                  ans.set(j+1,ans.get(j));
                  ans.set(j,temp);
                }
            }

         }
         if(ans.size()>0)
          return ans.toArray(new Sim[ans.size()]);
          else{
            return null;
          }
     }

}

class Sim
{
    int simId;
    String customerName, circle;
    double balance, ratePerSecond;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle)
    {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId()
    {
        return simId;
    }
    public void setSimId(int simId)
    {
        this.simId = simId;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getRatePerSecond()
    {
        return ratePerSecond;
    }
    public void setRatePerSecond(double ratePerSecond)
    {
        this.ratePerSecond = ratePerSecond;
    }
    public String getCircle()
    {
        return circle;
    }
    public void setCircle(String circle)
    {
        this.circle = circle;
    }
}
