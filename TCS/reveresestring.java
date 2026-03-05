package TCS;

import java.util.Scanner;

public class reveresestring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb.toString());

        StringBuilder ss=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            ss.append(s.charAt(i));
        }
        System.out.println(ss.toString());

        
    }
}
