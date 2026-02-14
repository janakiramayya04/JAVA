package infosys.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subnetwithbit {
    static  List<List<Integer>> subnets(int[] arr,int n){
        int subsets=1<<n;
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<subsets;i++){
            List<Integer> subset=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.println(i & (1 << j));
                    subset.add(arr[j]);
                }
            }
            ans.add(subset);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> subsets = subnets(arr, n);
         for (List<Integer> subset : subsets) {
            System.out.print("[ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}
