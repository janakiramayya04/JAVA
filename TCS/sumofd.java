package TCS;

import java.util.Scanner;

public class sumofd {
    static long sumofdigits(int num){
        long sum=0;

        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(sumofdigits(num));
    }
}
