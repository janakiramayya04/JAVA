package TCS;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        // System.out.println(num +" "+ num2);
        num = num ^ num2;
        num2 = num ^ num2;
        num = num ^ num2;
        System.out.println(num + " " + num2);

    }
}
