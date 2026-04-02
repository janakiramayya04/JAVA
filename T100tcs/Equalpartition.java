package T100tcs;

public class Equalpartition {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        if (sum % 2 != 0) {
            System.out.println(false);
            return ;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        System.out.println(dp[target]);
    }
}
