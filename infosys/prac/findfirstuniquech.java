package infosys.prac;

import java.util.HashMap;
import java.util.Scanner;


public class findfirstuniquech {
     public static int firstUniqChar(String s) {
        char[] rem=s.toCharArray();
        int index=-1;
        HashMap<Character,Integer> mpp=new HashMap<>();
        // for(char ch:rem){
        //     mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        // }
        for(int i=0;i<rem.length;i++){
            if(mpp.containsKey(rem[i])){
                mpp.put(rem[i],mpp.getOrDefault(rem[i],0)+1);
            }
            else{
                mpp.put(rem[i],mpp.getOrDefault(rem[i],0)+1);
            }
        }
        for(int i=0;i<rem.length;i++){
            if(mpp.get(rem[i])==1){
                return i; 
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int ans=firstUniqChar(s);
        System.out.println(ans);
    }
}
