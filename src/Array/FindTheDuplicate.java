package Array;

import java.util.Arrays;

public class FindTheDuplicate {
    static int getDuplicateNumber(int[] arr,int n){
        Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
           if(arr[i]==arr[i+1])
               return arr[i];
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,3,4,2,2};
        int n = arr.length;
        System.out.println(getDuplicateNumber(arr,n));
    }

}
