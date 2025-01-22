package Geeks.com.questions;

public class StockBuySell {

    // Recursive solution
    public static int maxProfitRecursive(int[] prices, int start, int end) {
        if (end <= start) {
            return 0;
        }

        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (prices[j] > prices[i]) {
                    int currProfit = prices[j] - prices[i] +
                                     maxProfitRecursive(prices, start, i - 1) +
                                     maxProfitRecursive(prices, j + 1, end);

                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }

    // Greedy solution
    public static int maxProfitGreedy(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 5, 3, 8, 12};

        // Recursive solution
        System.out.println("Maximum Profit (Recursive): " + maxProfitRecursive(prices, 0, prices.length - 1));

        // Greedy solution
        System.out.println("Maximum Profit (Greedy): " + maxProfitGreedy(prices));
    }
}
