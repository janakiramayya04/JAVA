package infosys.prac;

import java.util.Scanner;

public class swaptwonum {
    static void swap(int[] arr){
        arr[0]=arr[0]^arr[1];
        arr[1]=arr[0]^arr[1];
         arr[0]=arr[0]^arr[1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=2;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        swap(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
