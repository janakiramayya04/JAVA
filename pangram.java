
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();  // read full sentence

        Set<Character> set = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        System.out.println(set.size() == 26 ? "True" : "False");
        sc.close();
    }
}
