package Array;

public class SubArrayWithMaxProduct {
    static int maxProduct(int[] arr,int n){
        int maxProduct=arr[0];
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 1; i <n ; i++) {
            if(arr[i]<0){
                int temp = maxVal;
                maxVal = minVal;
                minVal =temp;
            }
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);
            maxProduct=Math.max(maxProduct,maxVal);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, -1, 0};
        int n=arr.length;
        System.out.println(maxProduct(arr,n));

    }
}
