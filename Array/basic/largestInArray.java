public class largestInArray {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1, 8, 7, 56, 90};
        int max=arr[0];
        for (int i = 0; i < n ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element in array is "+ max);
    }
}