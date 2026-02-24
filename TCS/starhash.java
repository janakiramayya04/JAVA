package TCS;

import java.util.Scanner;

public class starhash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt1=0,cnt2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                cnt1++;
            }else if(s.charAt(i)=='#'){
                cnt2++;
            }
        }
        System.out.println(cnt1-cnt2);
    }
}
