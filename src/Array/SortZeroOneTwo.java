package Array;

public class SortZeroOneTwo {
    public static void sort012(int a[], int n)
    {
        // code here
        int zeroes=0,ones=0,twoes=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                zeroes++;
            else if(a[i]==1)
                ones++;
            else if(a[i]==2)
                twoes++;
        }
        // System.out.println(twoes);
        int i=0;
        while(zeroes>0){
            a[i++]=0;
            zeroes--;
        }
        while(ones>0){
            a[i++]=1;
            ones--;
        }
        while(twoes>0){
            a[i++]=2;
            twoes--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0};
        sort012(arr,arr.length);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
