package infosys.prac;

import java.util.Scanner;

public class es2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                index=i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
    }
}
