package TCS;

import java.util.*;

public class solve2 {

    static int requiredpoints(int[][] arr) {

        int n = arr.length;
        int ans = 3;

        Set<String> set = new HashSet<>();

        // store all points
        for (int i = 0; i < n; i++) {
            set.add(arr[i][0] + "," + arr[i][1]);
        }

        for (int i = 0; i < n; i++) {

            int x1 = arr[i][0];
            int y1 = arr[i][1];

            for (int j = i + 1; j < n; j++) {

                int x2 = arr[j][0];
                int y2 = arr[j][1];

                int dx = x2 - x1;
                int dy = y2 - y1;

                // square on one side
                int cx1 = x2 - dy;
                int cy1 = y2 + dx;

                int dx1 = x1 - dy;
                int dy1 = y1 + dx;

                int missing1 = 0;

                if (!set.contains(cx1 + "," + cy1)) {
                    missing1++;
                }

                if (!set.contains(dx1 + "," + dy1)) {
                    missing1++;
                }

                ans = Math.min(ans, missing1);

                // square on other side
                int cx2 = x2 + dy;
                int cy2 = y2 - dx;

                int dx2 = x1 + dy;
                int dy2 = y1 - dx;

                int missing2 = 0;

                if (!set.contains(cx2 + "," + cy2)) {
                    missing2++;
                }

                if (!set.contains(dx2 + "," + dy2)) {
                    missing2++;
                }

                ans = Math.min(ans, missing2);
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
