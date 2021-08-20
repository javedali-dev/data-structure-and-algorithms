package Array;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    static boolean checkSubArrayWithSum(int[] arr,int n){
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            if(arr[i]==0||sum==0||set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr ={ -3, 2, 3, 1, 6 };
        int n= arr.length;
        if(checkSubArrayWithSum(arr,n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
