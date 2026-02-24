package TCS;

import java.util.Scanner;

public class isbinary {
    static boolean  checkbinary(int num){
        String regex="[01][01]+";
        return Integer.toString(num).matches(regex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(checkbinary(num));
    }
}
