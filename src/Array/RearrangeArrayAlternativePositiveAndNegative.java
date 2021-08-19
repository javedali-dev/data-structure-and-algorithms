package Array;

import java.util.Arrays;

public class RearrangeArrayAlternativePositiveAndNegative {

   static void lessNegative(int[] arr,int neg,int pos){
       if(neg%2==1){
           for (int i = 1; i <neg ; i+=2) {
               int c = arr[i];
               int d = arr[i+neg];
               arr[i] = d;
               arr[i+neg] = c;
           }
       }else{
           for (int i = 1; i <=neg ; i+=2) {
               int c=arr[i];
               int d = arr[i+neg-1];
               arr[i] = d;
               arr[i+neg-1]= c;
           }
       }
   }
    static void morePositive(int[] arr,int neg,int pos){
        if(pos%2==1){
            for (int i = 1; i <pos ; i+=2) {
                int c = arr[i];
                int d=arr[i+pos];
                arr[i]=d;
                arr[i+pos]=c;
            }
        }else{
            for (int i = 1; i <=pos ; i+=2) {
                int c = arr[i];
                int d =arr[i+pos-1];
                arr[i]=d;
                arr[i+pos-1]=d;
            }
        }
    }
    static void reverse(int[] arr,int n){
        for (int i = 0; i <n/2 ; i++) {
            int t=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=t;
        }
    }




    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;
       int neg=0,pos=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<0)
                neg++;
            else
                pos++;
        }
        Arrays.sort(arr);
        if(neg<=pos){
            lessNegative(arr,neg,pos);
        }else{
            reverse(arr,n);
            morePositive(arr,neg,pos);
        }
        Display.printArray(arr);
    }
}
