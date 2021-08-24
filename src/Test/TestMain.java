package Array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void testStockBuySellTwoTimes{
        int prices[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n= prices.length;
        assertEquals(100,StockBuySellTwoTimes.maxProfit(prices,n));
    }
}
