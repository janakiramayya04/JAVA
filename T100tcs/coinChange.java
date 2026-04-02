package T100tcs;

import java.util.Arrays;

public class coinChange {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]=Math.min(dp[i],1+dp[i-coin]);
            }
        }
        System.out.println(dp[amount]>amount?-1:dp[amount]);
    }
}
