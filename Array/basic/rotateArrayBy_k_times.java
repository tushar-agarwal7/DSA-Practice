public class rotateArrayBy_k_times {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=7;
        int k=3;
        rotate(arr,n,k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    static void rotate(int[] arr,int n,int k){
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            res[(i+k)%n]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i]=res[i];
        }
    }

}