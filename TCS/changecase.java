package TCS;

import java.util.Scanner;

public class changecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb.toString());
    }
}
