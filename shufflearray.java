public class shufflearray {
    public static int[] shuffle(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<k;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[i+k];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,3,7,5};
        int k=3;
        int[] ans=shuffle(arr, k);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
