package myprac;
import  java.util.*;
public class second {
     public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0);
        return res;
    }
    static void backtrack(List<List<Integer>> res,  List<Integer> current,int[] nums,int start){
        res.add(new ArrayList<>(current));
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(res, current, nums, i+1);
            current.remove(current.size()-1);
        }
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used =new boolean[nums.length];
        pbacktrack(res,new ArrayList<>(),nums,used);
        return res;
    }

    static void pbacktrack(List<List<Integer>> res, List<Integer> current, int[] nums, boolean[] used){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return; 
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i] =true;
            current.add(nums[i]);
            pbacktrack(res, current, nums, used);
            current.remove(current.size()-1);
            used[i]=false;
        }

    }
    public static void main(String[] args) {
        int[] ans={1,2,3};
        System.out.println(subsets(ans));
        System.out.println(permute(ans));
    }
}
