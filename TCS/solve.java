package TCS;

import java.util.*;

public class solve {

    static int requiredpoints(int[][] arr) {
        int ans = 3;
        int n = arr.length;
        Set<String> ss = new HashSet<>();
        for (int i = 0; i < n; i++) {
            ss.add(arr[i][0] + "," + arr[i][1]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if ((arr[i][0] + arr[j][0]) % 2 != 0 || (arr[i][1] + arr[j][1]) % 2 != 0) {
                    continue;
                }
                int mx = (arr[i][0] + arr[j][0]) / 2;
                int my = (arr[i][1] + arr[j][1]) / 2;
                int bx = mx + (arr[i][1] - my);
                int by = my - (arr[i][0] - mx);
                int dx = mx - (arr[i][1] - my);
                int dy = my + (arr[i][0] - mx);
                int missing = 0;

                if (!ss.contains(bx + "," + by)) {
                    missing++;
                }

                if (!ss.contains(dx + "," + dy)) {
                    missing++;
                }
                ans = Math.min(ans, missing);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

        }
        if (n == 1) {
            System.out.println(3);
            return;
        }

        System.out.println(requiredpoints(arr));
    }
}
