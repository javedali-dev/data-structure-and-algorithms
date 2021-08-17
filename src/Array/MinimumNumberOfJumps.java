package Array;

public class MinimumNumberOfJumps {
    static int getNumberOfJumps(int[] arr, int n){
        if(n<=1){
            return 0;
        }
        if(arr[0]==0)
            return -1;
        int maxReached = arr[0];
        int step = arr[0];
        int jump=1;
        for (int i = 1; i <n ; i++) {
            if(i==n-1)
                return jump;
            maxReached = Math.max(maxReached,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxReached)
                    return -1;
                step = maxReached-i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n= arr.length;
        System.out.println(getNumberOfJumps(arr,n));
    }
}
