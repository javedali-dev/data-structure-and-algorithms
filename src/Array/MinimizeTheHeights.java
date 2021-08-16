package Array;

import java.util.Arrays;

public class MinimizeTheHeights {
    static int getMinimizeHeights(int[] arr,int k,int n){
        if(n==1)
            return 0;
        Arrays.sort(arr);
        int max,min,ans = arr[n-1]-arr[0];
        for (int i = 1; i <=n-1 ; i++) {
            if(arr[i]>=k && arr[n-1]>=k ){
                max = Math.max(arr[i-1]+k,arr[n-1]-k);
                min = Math.min(arr[0]+k,arr[i]-k);
                ans = Math.min(ans,max-min);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[ ] arr  = {6 ,1 ,9 ,1, 1, 7 ,9 ,5 ,2, 10};
        int k = 4;
        int n = arr.length;
        System.out.println(getMinimizeHeights(arr,k,n));
    }
}
