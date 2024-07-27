
import java.util.ArrayList;

public class mergeSort {
    // divide into two parts when there is only one element left then start comparing and merge 

    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        mergeSorting(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
     }

     static void merge(int[] arr,int l,int m,int r){
        int left=l;
        int right=m+1;
        ArrayList<Integer> temp =new ArrayList<>();

        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
          }
        }
        while(left<=m){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <r; i++) {
            arr[i]=temp.get(i-l);
        }
     }

     static void mergeSorting(int[] arr,int l,int r){
        if(l==r){
            return ;
        }
        int mid=(l+r)/2;
         mergeSorting(arr, l, mid);
         mergeSorting(arr, mid+1,r);
         merge(arr,l,mid,r);
     }
}
