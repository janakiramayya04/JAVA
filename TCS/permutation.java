package TCS;

import java.math.BigInteger;
import java.util.Scanner;

public class permutation {
    static BigInteger fact(int num){
        BigInteger res=BigInteger.ONE;
        for(int i=num;i>0;i--){
            res=res.multiply(BigInteger.valueOf(i));
    }
return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger res=fact(n-1);
        System.out.println(res.multiply(BigInteger.valueOf(2)));
    }
    
}
