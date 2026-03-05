package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class frequency {
      public static void printFrequency(String str) {
    char[] chars = str.toCharArray();

    // Sort the character array
    Arrays.sort(chars);

    char ch = chars[0]; // First character
    int count = 1;

    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == ch)
        count++;
      else {
        System.out.print(ch + "" + count + " ");
        ch = chars[i];
        count = 1;
      }
    }

    // Print the count of last character
    System.out.print(ch + "" + count + " ");
  }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printFrequency(s);
    }
}
