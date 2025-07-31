package TcsIra;

import java.util.*;

class Market{
    private int id;
    private String name;
    private String category;
    private int price;
    private boolean available;

  public Market(int id,String name,String category, int price,boolean available){
    this.id=id;
    this.name=name;
    this.category=category;
    this.price=price;
    this.available=available;
  }

  public int getId(){
    return id;
  }
   public String getname(){
    return name;
  }
   public String getcategory(){
    return category;
  }
   public int getprice(){
    return price;
  }
   public boolean isAvailable(){
    return available;
  }

}

public class irajava {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     Market markets[]=new Market[4];

     for(int i=0;i<4;i++){
        
        int id=sc.nextInt();sc.nextLine();
        String name=sc.nextLine();
        String category=sc.nextLine();
        int price=sc.nextInt();sc.nextLine();
        boolean available=sc.nextBoolean();
        sc.nextLine();

        markets[i]=new Market(id, name, category, price, available);
     }
     String inputCategory = sc.nextLine();

     int total=totalprice(markets,inputCategory);
      if(total>0){
        System.out.println(total);
       }
       else{
         System.out.println("No item available with the given category");
       }

       Market thirdlowest=thirdminimum(markets);
       if(thirdlowest!=null){
        System.out.println(thirdlowest.getId());
        System.out.println(thirdlowest.getprice());
       }
       else{
         System.out.println("No such item available");
       }

     sc.close();
    }

   

    public static int totalprice(Market[] markets, String inputCategory) {
        int total=0;
        for(Market m:markets){
            if(m.getcategory().equalsIgnoreCase(inputCategory)){
                total+=m.getprice();
            }
        }
        return total;
       
    }
     public static Market thirdminimum(Market[] markets) {
        List<Market> availableItem=new ArrayList<>();
        for(Market m: markets){
            if(m.isAvailable()){
                availableItem.add(m);
            }
        }
        if(availableItem.size()<3){
            return null;
        }

        availableItem.sort(Comparator.comparingInt(Market::getprice));
        return availableItem.get(2);
        
    }
}
