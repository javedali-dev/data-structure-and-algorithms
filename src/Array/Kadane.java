package Array;

public class Kadane {

    static int maxSum(int[] arr){
        int max=Integer.MIN_VALUE,currentMax = 0;
        for(int i=0;i<arr.length;i++){
            currentMax +=arr[i];
//            System.out.println(currentMax);
            if(max<currentMax){
                max = currentMax;
            }
            if(currentMax<0){
                currentMax=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        System.out.println(maxSum(arr));
    }
}
