package TCS;

import java.util.*;

public class NandR {

    // public static int sumOfDigits(int n) {
    //     int sum = 0;
    //     while (n > 0) {
    //         sum += n % 10;
    //         n = n / 10;
    //     }
    //     return sum;
    // }
    public static int sumOfDigits(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        return sum;
    }
// long x = (long) sumOfDigits(n) * r; 
// You avoided constructing the huge repeated number.
// You avoided loops.
// You reduced everything to constant time math.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String n = sc.next();
        int r = sc.nextInt();
        // int[] arr=new int[n];
        if (r == 0) {
            System.out.println("0");
        } else {
            // int res=sumOfDigits(n)*r;
            long x = (long) sumOfDigits(n) * r;

            if (x == 0) {
                System.out.println(0);
            } else {
                System.out.println(1 + (x - 1) % 9);
            }
            // while(true){
            //     int sum=0;
            //     while(res>0){
            //         sum+=res%10;
            //         res=res/10;
            //     }
            //     if((sum/10)==0)
            //         break;
            //     else
            //         res=sum;
            // }
            // System.out.println(sum);
        }
    }
}
