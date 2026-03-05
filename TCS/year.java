package  TCS;
import java.util.Scanner;

public class year {

    static String dayofprogrammer(int year) {
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        } else if (year == 1918) {
            return "26.09." + year;
        } else {

            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yy = sc.nextInt();
        System.out.println(dayofprogrammer(yy));
    }
}
