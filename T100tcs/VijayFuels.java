package T100tcs;
// this is dp problem and knap sack problem 

public class VijayFuels {

    static int knapsack(int[] prices, int[] volumes, int k) {
        int n = prices.length;
        int[] dp = new int[k + 1];
        for (int i = 0; i < n; i++) {
            for (int w = k; w >= prices[i]; w--) {
                dp[w] = Math.max(dp[w], volumes[i] + dp[w - prices[i]]);
            }
        }
        return dp[k];
    }

    public static void main(String[] args) {
        int[] volumes = {10, 20, 20, 50, 150};
        int[] prices = {10, 10, 40, 50, 90};
        int k = 105;
        System.out.println(knapsack(prices, volumes, k));
    }
}
