// A 
// A B 
// A B C 
// A B C D 
// A B C D E
public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < 5; i++) {
            for(char ch='A';ch<='A' +i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
