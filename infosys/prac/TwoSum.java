package infosys.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    static int[] twoSum2(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Map<Integer, Integer> mpp = new HashMap<>();
        int tar = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            tar = target - num;
            if (mpp.containsKey(tar)) {
                ans[0] = mpp.get(tar);
                ans[1] = i;
            }
            mpp.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] ans = twoSum2(arr, target);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
