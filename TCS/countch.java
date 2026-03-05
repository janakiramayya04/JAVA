package TCS;

import java.util.Scanner;

public class countch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0, consonants = 0, spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("vowels " + vowels);
        System.out.println("consonants " + consonants);
        System.out.println("spaces " + spaces);
    }
}
