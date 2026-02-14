package infosys.prac;

import java.util.*;

public class es6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // int maxii=0;
        // int lowsum=arr[0]*arr[1];
        // int hightsum=arr[n-1]*arr[n-2];
        // maxii=Math.max(lowsum,hightsum);
        // System.out.println(maxii);
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }
        System.out.println(Math.max((min1 * min2), (max1 * max2)));
    }
}
