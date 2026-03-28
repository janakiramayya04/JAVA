package T100tcs;

import java.util.Scanner;

public class sequencecoutndp {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int N = sc.nextInt();
            int R = sc.nextInt();
            int END = sc.nextInt();

            long[][] dp = new long[N + 1][R + 1];

            // base case
            dp[1][1] = 1;

            for (int i = 2; i <= N; i++) {

                long total = 0;

                // calculate total ways from previous row
                for (int j = 1; j <= R; j++) {
                    total += dp[i - 1][j];
                }

                for (int j = 1; j <= R; j++) {
                    dp[i][j] = total - dp[i - 1][j];
                }
            }

            System.out.println(dp[N][END]);
        }
    }
}
