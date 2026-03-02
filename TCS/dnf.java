package TCS;

import java.util.*;

public class dnf {

    static void move_sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int hi = arr.length - 1;

        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi--] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        move_sort(arr);
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
