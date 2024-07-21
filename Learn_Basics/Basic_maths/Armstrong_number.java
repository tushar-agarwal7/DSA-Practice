public class Armstrong_number {

    static boolean isArmstrong(int num){
        int k = String.valueOf(num).length();
        int n=num;
        int sum=0;
        while(n>0){
             int c=n%10;
             sum+=Math.pow(c, k);
             n=n/10;
        }
        return sum == num;    }
    public static void main(String[] args) {
        int n=371;
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
