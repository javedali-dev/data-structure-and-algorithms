package Array;

public class RotateArray {
    static void rotateArray(int[] arr){
        int last = arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]=arr[i];
        }
        arr[0] =last;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        rotateArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
