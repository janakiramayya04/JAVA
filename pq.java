
public class pq {

    public static void main(String[] args) {
        // for (int i = 1; i <=n; i++) {
        //     for (int j = n; j >= i; j--) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println(" ");
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }
        // int num = 0;
        // int total_layer = (n + 1) / 2;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         int top = i - 1;
        //         int bottom = n - i;
        //         int right = n - j;
        //         int left = j - 1;
        //         int layer = Math.min(Math.min(top, bottom), Math.min(left, right));
        //         num = total_layer - layer;
        //         System.out.print(num + " ");
        //     }
        //     System.out.println(" ");
        // }
        int n = 4;
        int total = n * (n + 1);
        int left = 1;
        int right = total;
        // System.out.println(total);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(left++ + " ");
            }
            int temp = right - (n - i);   // starting point for this row
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(temp++ + " ");
            }
            right -= (n - i + 1);
            System.out.println(" ");
        }
    }
}
