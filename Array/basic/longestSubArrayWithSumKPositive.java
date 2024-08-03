public class longestSubArrayWithSumKPositive {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n=6;
        int k = 15;
        int i=0,j=0,sum=0,max=0;

        while(j<n){
            sum=sum+arr[j];

            while(i<=j && sum >k){
           sum=sum-arr[i];
           i++;
            }

            if(sum==k){
                if(j-i+1 >max){
                    max=j-i+1;
                }
            }
            j++;

            

        }

        System.out.println(max);



    }
}
