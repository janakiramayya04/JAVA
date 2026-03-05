package TCS;

import java.util.Scanner;

public class removevow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
