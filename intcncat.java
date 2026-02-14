
public class intcncat {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i]=nums[i];
        //     ans[i+nums.length]=nums[i];
        // }
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
        
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] ans=getConcatenation(arr);
        System.out.print("[");
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
