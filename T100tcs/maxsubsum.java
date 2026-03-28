package T100tcs;

import java.util.Scanner;

public class maxsubsum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            boolean[] dp=new boolean[k+1];
            dp[0]=true;
            for(int num:arr){
                for(int s=k;s>=num;s--){
                    if(dp[s-num]){
                        dp[s]=true;
                    }
                }
            }
            for(int s=k;s>=0;s--){
                if(dp[s]){
                    System.out.println(s);
                    break;
                }
            }
        }
    }
}
