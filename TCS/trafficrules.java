package TCS;

import java.util.Scanner;

public class trafficrules {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int date = sc.nextInt();
        int fine = sc.nextInt();

        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int EorO = date % 2 == 0 ? 1 : 0;
        int totalfine = 0;
        // if (EorO == 1) {
        //     for (int x : arr) {
        //         if (x % 2 != 0) {
        //             totalfine += fine;
        //         }
        //     }
        // } else {
        //     for (int x : arr) {
        //         if (x % 2 == 0) {
        //             totalfine += fine;
        //         }
        //     }
        // }
        for(int i=0;i<n;i++){
            int vehicle=sc.nextInt();
            if((vehicle%2)!=(date%2)){
                totalfine+=fine;
            }
        }
        System.out.println(totalfine);

    }
}
