package T100tcs;

import java.util.Scanner;

public class maximumwei {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxweight = sc.nextInt();
            int ans = 0;
            int currwei = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                currwei += arr[i];
                if (currwei > maxweight) {
                    currwei -= arr[j];
                    j++;
                }
                ans = Math.max(ans, i - j + 1);

            }
            System.out.println(ans);
        }
    }
}
