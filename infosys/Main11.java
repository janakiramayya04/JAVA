package infosys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        //minimum swaps required to sort an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] vis = new boolean[n];

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], i);
        }
        Arrays.sort(arr);
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] || mpp.get(arr[i]) == i) {
                continue;
            }
            int j = i, cyclesize = 0;
            while (!vis[j]) {
                vis[i] = true;

                j = mpp.get(arr[j]);
                cyclesize++;
            }
            if (cyclesize > 0) {
                swaps += (cyclesize - 1);
            }
        }
        System.out.println(swaps);

    }

}
