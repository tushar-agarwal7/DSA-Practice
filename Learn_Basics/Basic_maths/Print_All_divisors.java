public class Print_All_divisors {
    public static void main(String[] args) {
        int n=14;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i +" ");
            }
        }

    }
}
