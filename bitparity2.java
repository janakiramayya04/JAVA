import java.util.Arrays;

public class bitparity2 {
    static void  swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;   // FIX 1: i -> even index, j -> odd index

        while (i < nums.length && j < nums.length) {

            // FIX 2: check correctness of nums[i]
            if (nums[i] % 2 == 0) {
                i += 2;
            }
            // FIX 3: check correctness of nums[j]
            else if (nums[j] % 2 == 1) {
                j += 2;
            }
            // FIX 4: both misplaced → swap
            else {
                swap(nums, i, j);
                i += 2;
                j += 2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] ans={4,2,5,1};
        int[] arr = sortArrayByParityII(ans);
        System.out.print(Arrays.toString(arr));
    }
}
