package TCS;

import java.util.Scanner;

public class eo {
    static boolean  isEven(int num){
        if((num&1)==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
