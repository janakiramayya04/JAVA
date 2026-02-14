
import java.util.Arrays;

public class bitparity {
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static  int[] sortArrayByParity(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]%2==0){
                swap(nums,i,j);
                i++;
            }  
            j++;
        }
        return nums;

}
public static void main(String[] args) {
    int[] arr={3,1,2,4};
    int[] ans=sortArrayByParity(arr);
    System.out.print(Arrays.toString(ans));
}
}
