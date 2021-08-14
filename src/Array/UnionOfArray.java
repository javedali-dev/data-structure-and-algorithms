package Array;


import java.util.*;

public class UnionOfArray {
    //brute Force approach
    static int countUnion(int[] arr1,int[] arr2){
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        for (int i = 0; i <arr1.length ; i++) {
            a.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            b.add(arr2[i]);
        }
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        return union.size();


    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,5,3,7};
        int[] arr2 = {1,2,6,7};
        System.out.println(countUnion(arr1,arr2));
    }
}

