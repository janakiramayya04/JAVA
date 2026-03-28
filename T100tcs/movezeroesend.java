package T100tcs;

import java.util.Scanner;

public class movezeroesend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < n) {
            nums[count++] = 0;
        }
        for (int val : nums) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
