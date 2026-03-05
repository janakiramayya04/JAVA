package TCS;

import java.util.Scanner;

public class ASciivalue {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Ascii value is " + (int) s.charAt(0));
    }
    
}
