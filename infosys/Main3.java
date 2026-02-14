package infosys;

import java.util.Scanner;

class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        if (n % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }
            System.out.println(sb.reverse());
        } else {
            System.out.println(s);
        }
    }
}
