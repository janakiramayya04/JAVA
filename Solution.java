import java.util.*;

class Solution{
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int hi=nums[nums.length-1];
        System.out.println(hi);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static int bestmissingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
    }
     public static int bbmissingNumber(int[] nums) {
        int n = nums.length;
        int xor = n;
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums={0,1};
        System.out.println(nums.length);
        System.out.println(missingNumber(nums));
        System.out.println(bestmissingNumber(nums));
        System.out.println(bbmissingNumber(nums));
    }
}
