package infosys;

import java.util.Arrays;

public class CoinExchange {
      public static int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        int INF=(int)1e9;
         Arrays.fill(dp, INF);
        dp[0]=0;
        for(int amt=1;amt<=amount;amt++){
            for(int coin:coins){
                if(coin<=amt){
                dp[amt]=Math.min(dp[amt],dp[amt-coin]+1);
                }
            }
        } 
        return dp[amount] == INF ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int am=11;
        System.out.println(coinChange(arr, am));
    }
}
