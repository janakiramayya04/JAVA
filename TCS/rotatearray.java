package TCS;

import java.util.Scanner;

public class rotatearray {

    static void swapArray(int[] arr, int n, int k) {
        int x = n;
        int y = k;
        while (x < y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
    }
    static void leftrotate(int[] arr,int k){
        int n=arr.length;
        if(k==0) return;
        k = k % n;

        swapArray(arr, 0, k - 1);
        swapArray(arr, k, n - 1);
        swapArray(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leftrotate(arr, k);
        

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        arr=new int[]{1,2,3,4,5};
        //right rotate 
        leftrotate(arr, n-(k%n));
         for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
