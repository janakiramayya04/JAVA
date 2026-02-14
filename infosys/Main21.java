package infosys;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main21 {
    static boolean  isalldigitssame(int m,int B){
        Set<Integer> digits=new HashSet<>();
        int temp=m;
        while(temp>0){
            digits.add(temp%B);
            temp/=B;
        }
        return digits.size()==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int minBase=2;
        for(int B=minBase;B<m;B++){
            if(isalldigitssame(m, B)){
                System.out.println(B);
                break;
            }
        }
    }
}
