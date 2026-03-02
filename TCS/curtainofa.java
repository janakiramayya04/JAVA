package TCS;

import java.util.Scanner;

public class curtainofa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxii=0;
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();

        for(int i=0;i<s.length();i+=n){
            int count=0;
            for(int j=i;j<i+n&&j<s.length();j++){
                if(s.charAt(j)=='a'){
                    count++;
                }
            }
            maxii=Math.max(maxii,count);
        }
        System.out.println(maxii);
    }
}
