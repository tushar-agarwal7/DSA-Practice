public class findGCD {

    public static int find(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a == 0) {
            return b;
        }
        
        return a;
    }
    public static void main(String[] args) {
        
        int a=20;
        int b=15;
        int gcd=find(a,b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}
