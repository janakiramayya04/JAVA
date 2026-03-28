package T100tcs;

import java.util.Scanner;

public class majorityelement {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int votes = 0;
            int candiate = -1;
            for (int i = 0; i < n; i++) {
                if (votes == 0) {
                    candiate = arr[i];
                    votes = 1;
                } else {
                    if (arr[i] == candiate) {
                        votes++;
                    } else {
                        votes--;
                    }
                }
            }
            votes = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == candiate) {
                    votes++;
                }
            }
            if (votes > (arr.length / 2)) {
                System.out.println(candiate);
            }
        }
    }
}
