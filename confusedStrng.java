import java.util.Scanner;

public class confusedStrng {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        int i = 0, matched = 0;

        for (int j = 0; j < t.length(); j++) {
            while (i < s.length() && s.charAt(i) != t.charAt(j)) {
                i++;
            }
            if (i == s.length()) break;
            matched++;
            i++;
        }

        int result = t.length() - matched;
        System.out.println(result);
    }
}
