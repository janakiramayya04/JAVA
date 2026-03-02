package TCS;

import java.util.Scanner;

public class digitmulp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int multp=1;
        while(n>0){
            rem=n%10;
            multp*=rem;
            n=n/10;
        }
        System.out.println(multp);
    }    
}
