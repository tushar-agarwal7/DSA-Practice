public class rearrangeArrayElements {
    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int n=6;
        int[] res=new int[n];
        int pos=0,neg=1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                res[pos]=arr[i];
                pos+=2;
            }
            else if (arr[i]<0){
                res[neg]=arr[i];
                neg+=2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
