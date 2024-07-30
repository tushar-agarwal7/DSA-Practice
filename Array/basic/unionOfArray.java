
import java.util.ArrayList;

public class unionOfArray {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};    
        ArrayList<Integer> list=new ArrayList<>();

        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.get(list.size() -1 )!= arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {    
                     list.add(arr1[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(list.size()-1 != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(list.size()-1 != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        for(int val : list){
            System.out.print(val + " ");
        }

    }
}
