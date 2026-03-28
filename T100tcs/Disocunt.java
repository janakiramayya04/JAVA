package T100tcs;

import java.util.Scanner;

public class Disocunt {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int n =sc.nextInt();
            // if(n<1000){
            //     double per=n/20;
            //     System.out.println(n-per);
            // }else if(n<=1000  ||n<5000){
            //     double per=n/10;
            //     System.out.println(n-per);
            // }else if(n>=5000){
            //     double per=(0.15*n);
            //     System.out.println((int)n-per);
            // }
            double n = sc.nextDouble(); // amount
            double finalAmount;

            if (n < 1000) {
                finalAmount = n - (n * 0.05);
            } else if (n >= 1000 && n < 5000) {
                finalAmount = n - (n * 0.10);
            } else {
                finalAmount = n - (n * 0.15);
            }

            System.out.printf("%.2f\n", finalAmount);
        }

    }
}
