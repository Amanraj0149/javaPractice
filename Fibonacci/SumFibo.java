package Fibonacci;

public class SumFibo {
    static int fibbo(int n){
        int sum=0;
      if(n<=0) return 0;

       int fib[]=new int[2*n+1];
       fib[0]=0;
       fib[1]=1;
       for(int i=2;i<=2*n;i++){
        fib[i]=fib[i-1]+fib[i-2];
        if(i%2==0){
            sum+=fib[i];
        }
       }
        return sum;

    }
    public static void main(String[] args) {
        int n=4;

        int sum=fibbo(n);
        System.out.println(sum);
    }
}
