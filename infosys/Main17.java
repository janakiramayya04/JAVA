package infosys;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==1) System.out.println(arr[0]);

        int maxprod=arr[0];
        int miniprod=arr[0];
        int res=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int temp=maxprod;
                maxprod=miniprod;
                miniprod=temp;
            }
            maxprod=Math.max(arr[i], maxprod*arr[i]);
            miniprod=Math.min(arr[i], miniprod*arr[i]);

            res =Math.max(res, maxprod);
        }
        System.out.println(res);
    }

}
