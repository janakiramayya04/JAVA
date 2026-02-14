package infosys;

import java.util.*;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(arr,(a,b)->a[0]- b[0]);
        List<int[]> merged=new ArrayList<>();
        int[] prev=arr[0];
        for(int i=1;i<arr.length;i++){
            int[] interval=arr[i];
            if(interval[0]<=prev[1]){
                prev[1]=Math.max(prev[1], interval[1]);
            }
            else{
                merged.add(prev);
                prev=interval;
            }
        }
        merged.add(prev);

        System.out.println(Arrays.deepToString(merged.toArray(new int[merged.size()][])));

    }
}
