
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    // The majority element is the element that appears more than ⌊n / 2⌋ times.
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int n=7;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count=map.getOrDefault(arr[i], 0);
            map.put(arr[i], count+1);
            if(map.get(arr[i])>n/2){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("-1");
    }
}
