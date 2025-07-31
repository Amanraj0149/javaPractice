package TcsIra;

import java.util.*;

class Market{
private int id;
private String name;
private String category;
private int price;
private boolean available;

public Market(int id,String name,String category,int price,boolean available){
    this.id=id;
    this.name=name;
    this.category=category;
    this.price=price;
    this.available=available;
}
public int getId() {
        return id;
    }

    public String getItemName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}


public class Bazar{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Market[] markets=new Market[4];

       for(int i=0;i<4;i++){
        System.out.print("Enter ID: ");
       int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter Item Name: ");
       String name=sc.nextLine();
        System.out.print("Enter Category: ");
       String category=sc.nextLine();
        System.out.print("Enter Price: ");
       int price=sc.nextInt();sc.nextLine();
        System.out.print("Enter Price: ");
       boolean available=sc.nextBoolean();
       sc.nextLine(); // Clear buffer
            markets[i] = new Market(id, name, category, price, available);

       }
        System.out.print("Enter category to search total price: ");
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
        System.out.println(thirdlowest.getPrice());
       }
       else{
         System.out.println("No such item available");
       }

        sc.close();
    } 

    public static int totalprice(Market[] markets, String category){

        int total=0;
        for(Market m:markets){
            if(m.getCategory().equalsIgnoreCase(category)){
                total+=m.getPrice();
            }
        }
        return total;
}

  private static Market thirdminimum(Market[] markets) {
        List<Market> availableItem=new ArrayList<>();
        for(Market m: markets){
            if(m.isAvailable()){
                availableItem.add(m);
            }
        }
        if(availableItem.size()<3){
            return null;
        }

        availableItem.sort(Comparator.comparingInt(Market::getPrice));
        return availableItem.get(2);
       
    }
}
