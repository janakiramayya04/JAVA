package T100tcs;

import java.util.Scanner;

public class SequenceCountOptimized {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        int END = sc.nextInt();

        long[] prev = new long[R + 1];
        prev[1] = 1;

        for (int i = 2; i <= N; i++) {

            long total = 0;
            for (int j = 1; j <= R; j++) {
                total += prev[j];
            }

            long[] curr = new long[R + 1];

            for (int j = 1; j <= R; j++) {
                curr[j] = total - prev[j];
            }

            prev = curr;
        }

        System.out.println(prev[END]);
    }
}
