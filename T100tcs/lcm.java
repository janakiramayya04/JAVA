package T100tcs;

import java.util.Scanner;

public class lcm {
    // static int gcd(int n ,int m){
    //     if(m==0){
    //         return n;
    //     }else{
    //         return gcd(m,n%m);
    //     }
    // }

    // public static void main(String[] args) {
    //     try(Scanner sc=new Scanner(System.in)){
    //         int n =sc.nextInt();
    //         int m =sc.nextInt();
    //         int gcd=gcd(n,m);
    //         int lcm=(n*m)/gcd;
    //         System.out.println(lcm);
    //     }
    // }
  
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lowest(int a, int b) {
        return (a / gcd(a, b)) * b;  // safer to avoid overflow
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt(); // number of elements

            int result = sc.nextInt(); // first number

            for (int i = 1; i < n; i++) {
                int num = sc.nextInt();
                result = lowest(result, num);
            }

            System.out.println(result);
        }
    }
}

