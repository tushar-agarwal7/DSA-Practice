
import java.util.HashMap;
import java.util.Map;

public class highestLowestFrequency {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        Frequency(arr, n);   
     }

     static void Frequency(int[] arr,int n){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int currentCount=map.getOrDefault(arr[i], 0);
            map.put(arr[i], currentCount+1);
        }
        int maxFre=0,minFre=n;
        int maxEle=0,minEle=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();

            if(count>maxFre){
                maxEle=element;
                maxFre=count;
            }
            if(count<minFre){
                minEle=element;
                minFre=count;
            }
        }
        System.out.println("The highest frequency element is" + maxEle);
        System.out.println("The lowest frequency element is"+ minEle);
     }
}
