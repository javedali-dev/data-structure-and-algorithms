package Array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    static int countIntersection(int[] arr1,int[] arr2){
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        for (int i = 0; i <arr1.length ; i++) {
            a.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            b.add(arr2[i]);
        }
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        return intersection.size();


    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,5,3,7};
        int[] arr2 = {1,2,6,7};
        System.out.println(countIntersection(arr1,arr2));
    }
}
