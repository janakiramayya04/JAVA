package TCS;

import java.util.Scanner;

public class stringpalind {
    public static boolean palindrome(int i,String s){
        if(i>=s.length()/2) return true;

        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        return palindrome(i+1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // int i = 0;
        // int j = s.length() - 1;
        // while (i < j) {
        //     if (!Character.isLetterOrDigit(s.charAt(i))) {
        //         i++;
        //     } else if (!Character.isLetterOrDigit(s.charAt(j))) {
        //         j--;
        //     } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
        //         System.out.println("not palindrome");
        //         return;
        //     } else {
        //         // Move towards the middle if characters are the same
        //         i++;
        //         j--;
        //     }
        // }
        // System.out.println("palindrome");

        System.out.println(palindrome(0, s));
    }
}
