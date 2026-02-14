import java.util.*;

public class loflsuba {
    static int maxSubArraySum(int[] arr) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int maxi=0;
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }else if(mpp.containsKey(sum)){
                maxi=Math.max(maxi,i-mpp.get(sum));
            }
            else{
                mpp.put(sum,i);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr={9, -3, 3, -1, 6, -5};
        System.out.println("Maximum subarray sum is: " + maxSubArraySum(arr));
    }
}
