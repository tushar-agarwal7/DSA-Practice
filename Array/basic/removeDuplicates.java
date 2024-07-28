public class removeDuplicates {
    public static void main(String[] args) {
        int n=6;
        int[] arr={1,1,2,2,4,5};
        int k=remove(arr,n);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static int remove(int[] arr,int n){
        int i=0;
        for (int j = 1; j < n; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
