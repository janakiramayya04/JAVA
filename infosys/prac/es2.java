package infosys.prac;

import java.util.HashMap;
import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Character,Integer> mpp=new HashMap<>();
        String s=sc.nextLine();
       for(char c: s.toCharArray()){
        mpp.put(c, mpp.getOrDefault(c, 0)+1);
       }
        int index=-1;
        for(int i=0;i<s.length();i++){
            if(mpp.get(s.charAt(i))==1){
                index=i;
                break;
            }
           }
           System.out.println(index);
           sc.close();

    }
}
