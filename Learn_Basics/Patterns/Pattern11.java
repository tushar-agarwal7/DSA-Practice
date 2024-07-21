// 0
// 10
// 010
// 1010
public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        int a=1;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                a=1;
            }
            else {
                a=0;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a);
                a=1-a;
            }
            System.out.println();
        }
    }
}
