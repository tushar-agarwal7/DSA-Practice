public class selectionSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=6;
        selection_Sort(arr,n);
       
    }
    // take minimum index and swap it with starting indexes
    static void selection_Sort(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i; j < n; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i < n; i++) {
         System.out.print(arr[i]+ " ");   
        }
    }
}