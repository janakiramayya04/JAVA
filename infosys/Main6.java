package infosys;

import java.util.*;

public class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //brute force for postive

        // int count = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int sum = 0;
        //         for (int o = i; o <= j; o++) {
        //             sum += arr[o];
        //         }
        //         if (sum == k) {
        //             count = Math.max(count, j - i + 1);
        //         }
        //     }
        // }
        // System.out.println(count);
        // better approach ...
        // int maxl=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             maxl=Math.max(maxl,j-i+1);
        //         }
        //     }
        // }
        // System.out.println(maxl);
        // optimal for positive
        // int maxl=0;
        // int i=0,j=0;
        // int sum=arr[0];
        // while(j<n){
        //     while(i<=j && sum>k){
        //         sum-=arr[i];
        //         i++;
        //     }
        //     if(sum==k){
        //         maxl=Math.max(maxl,j-i+1);
        //     }
        //     j++;
        //     if(j<n){
        //         sum+=arr[j];
        //     }
        // }
        // System.out.println(maxl);
        // Map<Integer, Integer> mpp= new HashMap<>();
        // int sum=0;
        // int maxll=0;
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        //     if(sum==k){
        //         maxll=i+1;
        //     }
        //     int rem=sum-k;
        //     if(mpp.containsKey(rem)){
        //         int len=i-mpp.get(rem);
        //         maxll=Math.max(maxll, len);
        //     }
        //     if(!mpp.containsKey(rem)){
        //         mpp.put(sum, i);
        //     }
        // }
        // System.out.println(maxll);
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int rem = sum - k;
            if (mpp.containsKey(rem)) {
                count += mpp.get(rem);
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
        sc.close();
    }

}
