package infosys;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        if (arr[0][0] == 0 || arr[n - 1][m - 1] == 0) {
            System.out.println("NO");
            return;
        }
        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; j++) {
                if (arr[i][j] == 1) {
                    if (i > 0 && dp[i - 1][j]) {
                        dp[i][j] = true;
                    }
                    if (j > 0 && dp[i][j - 1]) {
                        dp[i][j] = true;
                    }

                }
            }
        }
        if (dp[n - 1][m - 1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
