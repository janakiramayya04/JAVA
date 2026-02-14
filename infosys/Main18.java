package infosys;

import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // int maxinde=0;
        // int maxvalue=-1;
        //  System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //      arr[i]=sc.nextInt();
        //     if(arr[i]>maxvalue){
        //         maxvalue=arr[i];
        //         maxinde=i;
        //     }
        // }
        // long maxv=compute(arr, maxinde,+1);
        // long maxvv=compute(arr, maxinde, -1);

        // System.out.println(Math.max(maxv, maxvv));
        // sc.close();
        // long maxvalue=0;
        // for(int i=0;i<n;i++){
        //     long total=0,xor=0;
        //     for(int j=0;j<n;j++){
        //         xor^=arr[(i+j)%n];
        //         total+=xor;
        //         maxvalue=Math.max(total, maxvalue);
        //     }
        //     for(int j=0;j<n;j++){
        //         xor^=arr[(i-j+n)%n];
        //         total+=xor;
        //         maxvalue=Math.max(total, maxvalue);
        //     }
        // }
        // System.out.println(maxvalue);
        int maxvalue = 0;
        for (int start = 0; start < n; start++) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = arr[(start + i) % n];

            }
            int ans = 0;
            int total = 0;
            for (int val : res) {
                ans ^= val;
                total += ans;

            }
            maxvalue = Math.max(total, maxvalue);

            for (int i = 0; i < n; i++) {
                res[i] = arr[(start - i + n) % n];

            }
            ans = 0;
            total = 0;

            for (int val : res) {
                ans ^= val;
                total += ans;
                maxvalue = Math.max(total, maxvalue);
            }
            maxvalue = Math.max(total, maxvalue);
        }
        System.out.println(maxvalue);

    }
    // static long compute(int[] arr,int start,int dir){
    //     int n=arr.length;
    //     int idx=start;
    //     int xor=0;
    //     long sum=0;
    //     for(int i=0;i<n;i++){
    //         xor^=arr[idx];
    //         sum+=xor;
    //         idx=(idx+dir+n)%n;

    //     }
    //     return sum;
    // }
}
