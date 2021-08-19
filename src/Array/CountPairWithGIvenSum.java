package Array;

import java.util.HashMap;

public class CountPairWithGIvenSum {
    static int getPairCount(int[] arr,int sum){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <arr.length ; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
                map.put(arr[i],map.get(arr[i])+1);

        }
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(map.get(sum-arr[i])!=null)
                count+=map.get(sum-arr[i]);
            if(sum-arr[i]==arr[i])
                count--;
        }
        return count/2;


    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int k = 2;
        System.out.println(getPairCount(arr,k));
    }
}
