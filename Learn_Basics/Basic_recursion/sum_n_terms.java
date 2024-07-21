public class sum_n_terms {
    public static void main(String[] args) {
        int n=5;
      int res= sum(n);
      System.out.println(res);
    }
    static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n+ sum(n-1);
    }
}
