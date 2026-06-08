package arrays;

public class MaxProfitStocks {
    public static void main(String[] args) {
        int[] prices = {7, 4, 5, 3, 9, 4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        // here we will compare the buying price with the current price of the stock if it is less than we will calculate the profit for that day
        // and if the buying price is more than the price at that day then we will not sell the stocks
        // rather we will buy at the current price (update the buying price to the price of the stock at that day )
        // Also we will actively compare the profit with the maxProfit variable and return the maxProfit
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            // Compare the buying price to the price of that day and securing profit
            if(buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                //Comparing with the maxProfit
                maxProfit = Math.max(maxProfit, profit);
                // if buyingPrice > price[i] then we will update the BP
            }else{
                buyingPrice = prices[i];
            }

        }
        if(maxProfit < 0) {
            return  0;
        }
        return maxProfit;
    }
}
