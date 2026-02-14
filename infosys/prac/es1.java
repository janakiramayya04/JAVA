package infosys.prac;

import java.util.Scanner;

public class es1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxcount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count += 1;
                maxcount = Math.max(maxcount, count);
            } else if (arr[i] != 1) {
                count = 0;

            }
        }
        System.out.println(maxcount);
        sc.close();
    }
}
