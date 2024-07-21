//    A
//    ABC
//   ABCDC
//  ABCDEDC
// ABCDEFEDC
public class Pattern17 {
    public static void main(String[] args) {
     int n=5;
     for (int i = 0; i <n; i++) {
         for (int j = 0; j <n-i; j++) {
             System.out.print(" ");
         }
         char ch='A';
         int br=(2*i+1)/2;
         for (int k = 0; k < 2*i+1; k++) {
             System.out.print(ch);
             if(k<=br){
                ch++;
             }
             else {
                ch--;
             }
         }
         System.out.println();
     }
    }
}
