package Array;

public class AllNegativeTogether {

    static void rearrange(int[] arr){
        int j=0,temp;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,-5,3,5,-9};
        rearrange(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
