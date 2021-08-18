package Array;

import java.util.Arrays;

public class NextPermutation {
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
           swap(nums,start,end);
            start++;
            end--;
        }
    }

    public static  void nextPermutation(int[] nums) {

        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }

        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);


    }




    public static void main(String[] args) {
        int[] arr = {5,4,7,5,3,2};
        nextPermutation(arr);
        Display.printArray(arr);
    }
}
