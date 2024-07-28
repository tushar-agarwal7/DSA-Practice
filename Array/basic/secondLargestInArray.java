public class secondLargestInArray {
    public static void main(String[] args) {
        int n=6;
       
        int max=Integer.MIN_VALUE;
        int smax=Integer.MAX_VALUE;
        int[] arr = {1, 2, 4, 7, 7, 5};    
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(max!=arr[i] && arr[i]>smax){
                smax=arr[i];
            }

        }
        System.out.println("Second largest element is "+ smax);
    }

}
