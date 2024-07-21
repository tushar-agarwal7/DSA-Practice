// 1      1
// 12    21
// 123  321
// 12344321
public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        int space=2*(n-1);
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k =1; k<=space ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
}
