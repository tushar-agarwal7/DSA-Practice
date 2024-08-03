public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int n=6;
        sort(nums,n);
        for (int i = 0; i <n; i++) {
            System.out.println(nums[i] + " ");
        }
    }
    static void sort(int[] arr,int n){
      int low=0;
      int high=arr.length-1;
      int i=0;
      while(i<=high){
        if(arr[i]==1){
            i++;
        }
        else if(arr[i]==0){
            int temp=arr[i];
            arr[i]=arr[low];
            arr[low]=temp;
            low++;
            i++;
        }
        else {
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            high--;
        }
      }

    }
}
