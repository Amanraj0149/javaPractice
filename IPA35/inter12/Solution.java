package IPA35.inter12;

import java.util.*;

public class Solution {    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Med[] m= new Med[4];
        for(int i=0;i<4;i++){
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c= sc.nextLine();
            int d=sc.nextInt();sc.nextLine();

            m[i]=new Med(a, b, c, d);

        }

        //m-1

    String c= sc.nextLine();

    Med[] ans= gpd(m,c);
    if(ans!=null){
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i].getpr());
        }
    }
    else{
      System.out.println("No medicine found");
    }
}

public static Med[] gpd(Med[] m,String s){
ArrayList<Med> ans1=new ArrayList<>();
  for(Med e:m){
    if(e.getdi().equalsIgnoreCase(s)){
      ans1.add(e);
    }
  }

  for(int i=0;i<ans1.size()-1;i++){
    for(int j=0;j<ans1.size()-i-1;j++){
        if(ans1.get(j).getpr()>ans1.get(j+1).getpr()){
            Med temp=ans1.get(j+1);
        ans1.set(j+1,ans1.get(j));
        ans1.set(j,temp);
        }
    }
  }
  if(ans1.size()>0){
     return ans1.toArray(new Med[ans1.size()]);
  }
  return null;

}
}

class Med{
   private String name,batch,di;
   private int pr;

   public Med(String name,String batch,String di,int pr){
    this.name=name;
    this.di=di;
    this.batch=batch;
    this.pr=pr;
   }

   public String getname(){
    return name;
   }

   public String getbatch(){
    return batch;

}

public String getdi(){
    return di;
}

public int getpr(){
    return pr;
}

}