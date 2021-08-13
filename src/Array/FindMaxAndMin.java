package Array;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,6,9};
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i])
                max =arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}
