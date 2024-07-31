public class missingNumberInArray {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int n=3;
        int sum=n*(n+1)/2;
        int s2=0;
        for (int i = 0; i < n; i++) {
            s2=s2+arr[i];

        }
        int res=sum-s2;
        System.out.println("Missing Number is "+ res);

    }
}
