
import java.util.Arrays;

public class longestConsicutiveSequence {
    
    public static void main(String[] args) {
        int[] arr={100,101,102,1,1,2,2,3,4};
        int n=9;
            Arrays.sort(arr);
            int count=0;
            int longest=1;
            int last_smaller=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i]-1 == last_smaller){
                count++;
                last_smaller=arr[i];

            }
            else if(arr[i]!=last_smaller){
             last_smaller=arr[i];
             count=1;
            }
            longest=Math.max(longest, count);
        }
        System.out.println("The longest sequence is " + longest);


    }
}
