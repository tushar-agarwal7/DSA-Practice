public class linearSearch {
    public static void main(String[] args) {
        int n=6;
        int[] arr={1,2,3,4,5,6};
        int k=6;
       int res=search(arr,n,k);
       System.out.println(res);
    }

    static int search(int[] arr,int n,int k){
        for (int i = 0; i < n; i++) {
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
