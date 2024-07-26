public class insertionSort {
    public static void main(String[] args) {
        //take an element and place it in order

        int arr[]={6,5,4,3,2,1};
        int n=6;
        for (int i = 0; i < n; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
}
