public class maxArraySum {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int n=9;
        int sum=0;
        int max=nums[0];
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        
        }
        System.out.println("The maximum sum is " + max);
        
    }
}