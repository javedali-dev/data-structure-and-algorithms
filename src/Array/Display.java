package Array;

import java.util.ArrayList;

public class Display {
    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArray(ArrayList<Integer> arr){
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
