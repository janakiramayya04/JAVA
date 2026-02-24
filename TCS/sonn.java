package TCS;

import java.util.Scanner;

public class sonn {
    static long sumofnaturalnumbers(int num){
        return (num*(num+1)*(num+2))/6;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sumofnaturalnumbers(num));
        sc.close();

    }
}
