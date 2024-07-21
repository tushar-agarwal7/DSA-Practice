

public class Reverse_Number {
    public static void main(String[] args) {
        int n=123;
   
        int rev=0;
        while(n!=0){
            int c=n%10;
            rev=rev*10+c;
            n=n/10;
        }
        System.out.println(rev);
    }
}
