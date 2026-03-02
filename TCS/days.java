package TCS;

import java.util.*;

public class days {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().toLowerCase();

        String[] arr = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};

        int startIndex = 0;

        for (int i = 0; i < 7; i++) {
            if (arr[i].equals(s)) {
                startIndex = i;
                break;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if ((startIndex + i) % 7 == 6) {  // Sunday index = 6
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
