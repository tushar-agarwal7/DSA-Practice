public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,3,0,12};
        int n=5;
        moveZeroes(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    static void moveZeroes(int[] arr,int n){
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for (int i = j; i < n; i++) {
            arr[i]=0;
        }
    }
}
