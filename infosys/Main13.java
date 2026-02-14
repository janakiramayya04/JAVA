package infosys;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int al=sc.nextInt();
        int[] arr1=new int[al];
        int actuallarraysize=sc.nextInt();
        int al2=sc.nextInt();
        int ac2=sc.nextInt();
        int[] arr2=new int[al2];
        for(int i=0;i<actuallarraysize;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<ac2;i++){
            arr2[i]=sc.nextInt();
        }
        int left=actuallarraysize-1;
        int right=ac2-1;
        int k=actuallarraysize+ac2-1;
        while(left>=0 && right>=0){
            if(arr1[left]>arr2[right]){
                arr1[k]=arr1[left];
                left--;
            }
            else{
                arr1[k]=arr2[right];
                right--;
            }
            k--;
        }
        while(right>=0){
            arr1[k]=arr2[right];
            right--;
            k--;
        }
        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}
