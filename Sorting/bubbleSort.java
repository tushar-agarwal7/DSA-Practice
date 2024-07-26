public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        int n=6;
        for(int i=n-1;i>=0;i--){
            int didSwap=0;
            //is for loop ke swap me max element last me aajaega
            for (int j = 0; j <=i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;

                }
            }
            if(didSwap==0){
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
