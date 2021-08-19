package Array;

public class StockBuyAndSell {
    static int getMaximumProfit(int[] prices,int n){
       int min = prices[0];
       int maxprofit = 0;
        for (int i = 0; i < prices.length ; i++) {
            min = Math.min(prices[i],min);
            int profit = prices[i]-min;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int n=arr.length;
        System.out.println(getMaximumProfit(arr,n));
    }
}
