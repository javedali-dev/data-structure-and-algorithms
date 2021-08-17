package Array;

public class KadaneRevision {
    static int getMinimized(int[] arr){
        int currentMax=0,totalMax = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            currentMax += arr[i];
            if(currentMax>totalMax)
                totalMax = currentMax;
            if(currentMax<0)
                currentMax=0;
        }
        return totalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        System.out.println(getMinimized(arr));
    }
}
