
import java.util.ArrayList;

public class intersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,6};
        int[] b={3,4,5,6,7};
        int n=7;
        int m=5;
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n && j<m){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                list.add(a[i]);
                i++;
                j++;
            }

        }
       for(int val :list){
        System.out.print(val + " ");
       }
    }
}
