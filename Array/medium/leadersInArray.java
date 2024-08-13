
import java.util.ArrayList;
import java.util.Collections;

public class leadersInArray {
    public static void main(String[] args) {
        int[]  arr = {16,17,4,3,5,2};
        int n=6;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}