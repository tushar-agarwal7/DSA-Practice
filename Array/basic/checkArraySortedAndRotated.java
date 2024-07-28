public class checkArraySortedAndRotated {
    public static void main(String[] args) {
        int n=5;
        int[] arr={3,4,5,1,2};

        int count=0;
        for (int i = 1; i < n; i++) {
            if(arr[i-1]> arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        if(count<=1){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
