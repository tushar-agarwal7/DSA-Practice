public class string_is_palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            if(isPalindrome(0,s)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
    }
    public static boolean isPalindrome(int i,String s){
        int n=s.length();
        if(i>=n/2){
            return true;

        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(i+1, s);
    }
}
