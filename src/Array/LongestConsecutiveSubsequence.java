package Array;

import java.util.HashSet;
import java.util.TreeSet;

public class LongestConsecutiveSubsequence {
    static int findLongestConsecutive(int[] arr,int n){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

       int ans = 0;
        for (int i = 0; i < n; i++) {
           if(!set.contains(arr[i]-1)){
               int j=arr[i];
               while(set.contains(j)){
                   j++;
               }
               if(ans<j-arr[i]){
                   ans=j-arr[i];
               }
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        System.out.println(findLongestConsecutive(arr,arr.length));
    }
}
