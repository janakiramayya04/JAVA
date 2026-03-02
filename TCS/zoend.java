package TCS;

import java.util.Scanner;

public class zoend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int left = 0;
        // int right = n - 1;
        // while(left < right){
        //     if(arr[left] == 0){
        //         int temp = arr[left];
        //         arr[left] = arr[right];
        //         arr[right] = temp;
        //         right--;
        //     } else {
        //         left++;
        //     }
        // }
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
