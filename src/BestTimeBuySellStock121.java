public class BestTimeBuySellStock121 {

    //Say you have an array for which the ith element is the price of a given stock on day i.
    //If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
    // design an algorithm to find the maximum profit.
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || isInorder(prices)) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i];
            int maxPrice = maxPrice(prices, i + 1);
            if (profit < maxPrice) {
                profit = maxPrice - profit;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    private boolean isInorder(int[] prices) {
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private int maxPrice(int[] prices, int start) {
        if (start >= prices.length) {
            return 0;
        }
        int max = prices[start];
        for (int i = start + 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        return max;
    }

}
