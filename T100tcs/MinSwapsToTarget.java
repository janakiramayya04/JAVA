package  T100tcs;

import java.util.*;

public class MinSwapsToTarget {
    public static int minSwaps(int[] arr, int[] target) {
        int n = arr.length;

        // Step 1: map value -> index in target
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(target[i], i);
        }

        // Step 2: build position array
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = map.get(arr[i]);
        }

        // Step 3: count cycles
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || pos[i] == i)
                continue;

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = pos[j];
                cycleSize++;
            }

            if (cycleSize > 1)
                swaps += (cycleSize - 1);
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] target = {1, 2, 3, 4};

        System.out.println(minSwaps(arr, target)); // Output: 2
    }
}