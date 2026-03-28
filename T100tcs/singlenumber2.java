package T100tcs;

public class singlenumber2 {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2};
        // int res = 0;
        // for (int i = 0; i < 32; i++) {
        //     int count = 0;
        //     for (int n : arr) {
        //         if ((n & (1 << i)) != 0) {
        //             count++;
        //         }
        //     }
        //     if (count % 3 != 0) {
        //         res = res | (1 << i);
        //     }
        // }
        // System.out.println(res);
        int ones = 0, twos = 0;

        for (int x : arr) {
            ones = (ones ^ x) & ~twos;
            twos = (twos ^ x) & ~ones;
        }

        System.out.println(ones);
    }
}
