package Array;

import java.util.HashMap;
import java.util.Map;

public class FindAllTheElementNbyK {
    static void moreThanNdk(int arr[], int n,int k){
        int x = n/k;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <n ; i++) {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else{
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
        }
        for (Map.Entry value:map.entrySet()) {
            Integer temp =(Integer)value.getValue();
            if(temp>x)
                System.out.println(value.getKey());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,12,2,2,2,23,4,3,5,5,5,5};
        int n= arr.length;
        int k =4;
        moreThanNdk(arr,n,k);
    }
}
