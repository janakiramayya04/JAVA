package TCS;

import java.util.Scanner;

public class character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            char ld=Character.toLowerCase(ch);
            if(ld>='a' && ld<='z'){
                sb.append(ld);
            }
        }
        System.out.println(sb.toString());
    }
}
