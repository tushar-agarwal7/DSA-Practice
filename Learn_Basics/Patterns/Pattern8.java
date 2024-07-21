// ***********
//  *********
//   *******
//    *****
//     ***
//      *
public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int a=10;

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
     System.out.print(" ");
            }
            for(int k=0;k<=a;k++){
                System.out.print("*");
            }
            a=a-2;
            System.out.println();
        }
    }
}