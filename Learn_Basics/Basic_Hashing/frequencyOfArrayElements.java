import java.util.HashMap;
import java.util.Map;

public class frequencyOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        Frequency(arr, n);    
      
    }

    static void Frequency(int[] arr,int n){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int currentCount=map.getOrDefault(arr[i],0);
            map.put(arr[i],currentCount+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}