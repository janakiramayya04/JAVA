package infosys;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // brute force // maximum product of subarray for postivies only.
        // int maxprod=1;
        // for(int i=0;i<n;i++){
        //     int prod=1;
        //     for(int j=1;j<n;j++){
        //         prod*=arr[j];
        //         maxprod=Math.max(prod, maxprod);
        //     }
        // }
        // System.out.println(maxprod);

    }
}
