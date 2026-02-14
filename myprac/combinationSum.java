package myprac;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static  List<List<Integer>> csum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),0,candidates,target,0);
        return res;
    }
    public static void backtrack(List<List<Integer>> res, List<Integer> curr,int sum, int[] nums,int tar,int start){
        if (sum > tar) return;
         if(sum==tar){
            res.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            sum+=nums[i];
            backtrack(res,curr,sum,nums,tar,i);
            sum-=nums[i];
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        System.out.println(csum(arr,target));
    }
}
