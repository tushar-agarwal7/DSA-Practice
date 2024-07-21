public class factorial {
    public static void main(String[] args) {
        int n=4;
        int res=fact(n);
        System.out.println(res);
    }

    static int fact(int n){
        if(n<=0){
            return 1;
        }
        return n* fact(n-1);
    }

}
