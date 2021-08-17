package Array;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeInterval {
    static int[][] mergeInterval(int[][] arr){
       Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
       LinkedList<int[]> merged = new LinkedList<int[]>();
       for(int[] a:arr){
           if(merged.isEmpty()||merged.getLast()[1]<a[0]){
               merged.add(a);
           }
           else{
               merged.getLast()[1] = Math.max(merged.getLast()[1],a[1]);
           }
       }
       return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] arr2 = mergeInterval(arr);
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
