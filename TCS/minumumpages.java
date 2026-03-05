package TCS;

import java.util.Scanner;

public class minumumpages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int page = sc.nextInt();
        int num = sc.nextInt();
        // int min = 0;
        // for (int i = 1; i < page; i++) {
        //     if (num != i) {
        //         min += 1;
        //     }
        //     // if (num % 2 == 0) {
        //     //     if (num == i) {

        //     //         System.out.println(min - 1);
        //     //         return;
        //     //     }
        //     // } else if (num % 2 != 0) {
        //     //     System.out.println(min - 2);
        //     //     return;
        //     // }
        //     if (num == i) {
        //         if (num % 2 == 0) {
        //             System.out.println(min );
        //             return;
        //         } else {
        //             System.out.println(min - 1);
        //             return;
        //         }

        //     }
        // }
        int first=num/2;
        int last=page/2-num/2;
        System.out.println(Math.min(last, first));
    }
}
