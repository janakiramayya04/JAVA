package T100tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class findDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> ll = new ArrayList<>();
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     if(!set.contains(nums[i])){
        //         set.add(nums[i]);
        //     }else{
        //         ll.add(nums[i]);
        //     }
        // }
        // // for(int val:nums){
        // //     if(set.contains(val)){
        // //         ll.add(val);
        // //     }
        // // }

        // for(int hil:ll){
        //     System.out.print(hil);
        // }
        for (int i = 0; i < n; i++) {
            int inde = Math.abs(nums[i]) - 1;
            if (nums[inde] < 0) {
                ll.add(Math.abs(nums[i]));

            } else {
                nums[inde] = -nums[inde];
            }
        }
        System.out.println(ll);
    }
}
