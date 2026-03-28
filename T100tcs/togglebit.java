package T100tcs;

import java.util.Scanner;

public class togglebit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String bin="";
        // while(n!=0){
        //     bin=(n&1)+bin;
        //     n=n>>1;

        // }
        // bin=bin.replaceAll("1", "2");
        // bin=bin.replaceAll("0", "1");
        // bin=bin.replaceAll("2", "0");
        // int res=Integer.parseInt(bin,2);
        // System.out.println(res);
        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;
        int res = n ^ mask;
        System.out.println(res);

    }
}
