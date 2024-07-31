// every element appears twice except for one. Find that single one.
public class singleNumber {
    public static void main(String[] args) {
        int[] nums={2,2,1};
        int res=0;
        for(int num:nums){
            res=res^num;
        }
        System.out.println(res);
    }
}
