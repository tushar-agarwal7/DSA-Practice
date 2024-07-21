public class fibonacci {
    public static void main(String[] args) {
        int n=5;
       int res= fibo(n);
       System.out.println(res);
    }
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }            
        int a=fibo(n-1) + fibo(n-2);
        return a;                                                                                                      
    }
}
