
public class peitself {

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = l;
            l *= nums[i];
        }
        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= r;
            r *= nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] uio = {1, 2, 3, 4};
        int[] ans = productExceptSelf(uio);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
