import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int n=4;
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < n; i++) {
            int target2=target-nums[i];
             if(map.containsKey(target2)){
                System.out.println(map.get(target2) + " " + i);
                return;
             }
             else {
                map.put(nums[i],i);
            }
        }
    }
}
