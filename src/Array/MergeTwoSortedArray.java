package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    static void mergeSortedArray(int[] arr1, int[] arr2){
//        int i=0,j=0,temp;
//        while(i<arr1.length){
//            if(arr1[i]>arr2[0]){
//                temp = arr1[i];
//                arr1[i] = arr2[0];
//                arr2[0]= temp;
//                Arrays.sort(arr2);
//            }
//            i++;
//        }
        // Second method
        int i=0,j=0,k=arr1.length-1;
        while(i<=k && j< arr2.length){
            if(arr1[i]<arr2[j])
                i++;
            else{
                int temp = arr2[j];
                arr2[j]= arr1[k];
                arr1[k]=temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }

    public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7};
            int[] arr2 =  {0, 2, 6, 8, 9};
            mergeSortedArray(arr1,arr2);
            Display d  = new Display();
            d.printArray(arr1);
            d.printArray(arr2);
    }
}
