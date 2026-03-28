package T100tcs;

import java.util.Scanner;

public class march21e {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) {
                System.out.println("Error");
                return;
            }
            int hours = sc.nextInt();
            int amount;
            
            if (hours <= 2) {
                amount = hours * 100;
            } else if (hours <= 5) {
                amount = 2 * 100 + (hours - 2) * 50;
            } else {
                amount = 2 * 100 + 3 * 50 + (hours - 5) * 20;
            }
            System.out.println("Total Charge : " + amount);
        }
    }
}
