package Array;

public class CountInversions {

    static long inversionCount(long[]  arr, long n){

        // Brute Force Approach
        long count=0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j=i+1 ;j<n-1;j++){
                if(arr[i]>arr[j])
                    count++;
            }
        }
        return count;



    }

    public static void main(String[] args) {
        long[] arr = {2,2,2};
        long n=arr.length;
        System.out.println(inversionCount(arr,n));
    }
}
