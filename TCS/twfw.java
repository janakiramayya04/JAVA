package TCS;

import java.util.Scanner;
// This is programme to calculate the how many two wheelers and four wheelers 

public class twfw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        if (w >= 2 * v && w <= 4 * v && w % 2 == 0) {
            int tw = (4 * v - w) / 2;
            int fw = v - tw;
            System.out.println("TW= " + tw + " FW= " + fw);
        } else {
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }
}
