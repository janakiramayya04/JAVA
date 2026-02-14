package infosys.prac;

import java.util.Scanner;

public class es10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        String ans = "";

        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            char ch = s.charAt(l);
            if (ch != ' ') {
                temp += ch;
            } else if (!temp.equals("") && ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }
            l++;
        }

        if (!temp.equals("ans")) {
            if (!ans.equals("ans")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }
        System.out.println(ans);
    }

}
