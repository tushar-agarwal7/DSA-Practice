public class Check_palindrome {

    static boolean palindrome(int n){
     int rev=0;
     int temp=n;

     while(temp!=0){
        int c=temp%10;
        rev=rev*10+c;
        temp=temp/10;

     }

     return n == rev;
    }
    public static void main(String[] args) {
        int n=121;
        if(palindrome(n)){
            System.out.println(n +  " is palindrome");
        }
        else{
            System.out.println(n + " is not a palindrome.");
        }
    }
}
