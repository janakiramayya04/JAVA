package infosys;

import java.util.*;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        int l=1;
        for(int i=0;i<n;i++){
            ans[i]=l;
            l*=arr[i];
        }
        int r=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=r;
            r*=arr[i];
        }
        for(int x:ans){
            System.out.print(x +" ");
        }
    }
}
