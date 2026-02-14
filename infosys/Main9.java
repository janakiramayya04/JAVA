package infosys;

import java.util.*;

public class Main9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // ArrayList<Integer> postive = new ArrayList<>();
        // ArrayList<Integer> negative = new ArrayList<>();
        // for (int it : arr) {
        //     if (it >= 0) {
        //         postive.add(it);
        //     } else {
        //         negative.add(it);
        //     }
        // }
        // int p = 0, q = 0, i = 0;
        // while (p < postive.size() && q < negative.size()) {
        //     arr[i++] = postive.get(p++);
        //     arr[i++] = negative.get(q++);
        // }
        // while (p < postive.size()) {
        //     arr[i++] = postive.get(p++);
        // }
        // while (q < negative.size()) {
        //     arr[i++] = negative.get(q++);
        // }
        // for (int x : arr) {
        //     System.out.print(x + " ");
        // }
        int i = 0, j = 1;

        while (i < n && j < n) {
            if (arr[i] > 0) {
                i += 2;
            } else if (arr[j] < 0) {
                j += 2;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
