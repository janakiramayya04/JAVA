package TCS;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s2=sc.nextLine();
        // sc.nextLine();
        String s3=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length();i++){
            sb.append(s2.charAt(i));
        }
        for(int j=0;j<s3.length();j++){
            sb.append(s3.charAt(j));
        }
        System.out.println(sb.toString());
    }
}
