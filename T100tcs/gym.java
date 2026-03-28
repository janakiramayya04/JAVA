package T100tcs;

import java.util.Scanner;

public class gym {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){

            System.out.println("invalid input");
            return;
        }
        switch (n) {
            
            case 1 -> System.out.println(2000);
            case 2, 3 -> System.out.println(5000);
            case 4, 5, 6 -> System.out.println(9000);
            case 9 -> System.out.println(12000);
            case 12 -> System.out.println(15000);
            default -> System.out.println("Error");
        }
    }
}
