package Array;

import java.util.*;

public class CommonElementInThreeSortedArray {
    static ArrayList<Integer> commonElement(int[] A, int[] B, int[] C, int n1, int n2, int n3){
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        TreeSet<Integer> set3 = new TreeSet<Integer>();
        for (int i = 0; i <n1 ; i++) {
            set1.add(A[i]);
        }
        for (int i = 0; i <n2 ; i++) {
            set2.add(B[i]);
        }
        for (int i = 0; i <n3 ; i++) {
            set3.add(C[i]);
        }
        set1.retainAll(set2);
        set1.retainAll(set3);
        return new ArrayList<Integer>(set1);
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        Display.printArray(commonElement(A,B,C,A.length,B.length,C.length));
    }
}
