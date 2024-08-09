public class buyAndSell {
    public static void main(String[] args) {
        int[] nums={7,1,2,3,5,6,4};
        int n=7;
        int min=nums[0];
        int profit=0;
        for (int i = 0; i < n; i++) {
            int cost=nums[i]-min;
            if(min>nums[i]){
                min=nums[i];
            }
            if(profit<cost){
            profit=cost;
            }
        }
        System.out.println("The maximum profit is " + profit);
    }
}
