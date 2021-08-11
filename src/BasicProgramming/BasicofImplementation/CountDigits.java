package BasicProgramming.BasicofImplementation;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char[] digits = a.toCharArray();
        int[] arr = new int[10];
        for(char x:digits){

            int temp = Character.getNumericValue(x);
            arr[temp]++;

        }
        for(int i=0;i<10;i++){
            System.out.println(i+" "+arr[i]);
        }
    }
}
