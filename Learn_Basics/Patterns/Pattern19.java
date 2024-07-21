// ***** *****
// ****   ****
// ***     ***
// **       **
// *         *
// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****

public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        int a=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < a; k++) {
                System.out.print(" ");
            }
            for (int k = n-i; k > 0; k--) {
                System.out.print("*");
            }
            a=a+2;
            System.out.println();

        }
        int b=2*n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < b; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
               System.out.print("*"); 
            }
            b=b-2;
            System.out.println();
        }
    }
}
