package infosys.prac;

import java.util.Scanner;

public class es5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // int digit=sc.nextInt();
        // char d=(char) (digit+'0');
        // int indextoremove=-1;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==d && s.charAt(i)<s.charAt(i+1)){
        //         indextoremove=i;
        //         break;
        //     }
        // }
        // if(indextoremove==-1){
        //     for(int i=s.length()-1;i>=0;i--){
        //         if(s.charAt(i)==d){
        //             indextoremove=i;
        //             break;
        //         }
        //     }
        // }
        // String res=s.substring(0,indextoremove)+s.substring(indextoremove+1);
        // System.out.println(res);
        // sc.close();
        
        // int indextoremove=0;
        // char ch=sc.next().charAt(0);
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==ch){
        //         indextoremove=i;
        //         if(i+1<s.length()&& s.charAt(i)<s.charAt(i+1)){
        //             System.out.println(s.substring(0,i)+s.substring(i+1));
        //         }
        //     }
        // }
        // String rs=s.substring(0,indextoremove)+s.substring(indextoremove+1);
        // System.out.println(rs);

        // System.out.println(s);
        char ch = sc.next().charAt(0);
        String op=removestring(s, ch);
        System.out.println(op);

    }

    static String removestring(String s, char ch) {
        int indextoremove = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                indextoremove = i;
                if (i + 1 < s.length() && s.charAt(i) < s.charAt(i + 1)) {
                    return (s.substring(0, i) + s.substring(i + 1));
                }
            }
        }
        return s.substring(0, indextoremove) + s.substring(indextoremove + 1);
    }
}
