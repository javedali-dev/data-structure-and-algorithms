package Array;

public class StockBuySellTwoTimes {
    public static int maxProfit(int[] prices,int n){
        int[] profit = new int[n];
        for (int i = 0; i <n ; i++) {
            profit[i]=0;
        }
        int maxPrice = prices[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(maxPrice<prices[i]){
                maxPrice=prices[i];
            }
            profit[i]= Math.max(profit[i+1],maxPrice-prices[i]);
        }

        int minPrice=prices[0];
        for (int i = 1; i <n ; i++) {
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            profit[i] = Math.max(profit[i-1],profit[i]+(prices[i]-minPrice));
        }
        return profit[n-1];

    }

}
