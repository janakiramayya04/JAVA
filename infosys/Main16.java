package infosys;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main16 {

    static int atMostKDistinct(String s, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Character, Integer> mpp = new HashMap<>();
        int left = 0;
        int count = 0;
        for (int right = 0; right <s.length(); right++) {
            char c =s.charAt(right);
            mpp.put(c, mpp.getOrDefault(c, 0)+1);

            while(mpp.size()>k){
                char leftchar=s.charAt(left);
                mpp.put(leftchar,mpp.get(leftchar)-1);
                if(mpp.get(leftchar)==0){
                    mpp.remove(leftchar);
                }
                left++;
            }
            count+=(right-left+1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int k = sc.nextInt();
        System.out.println(atMostKDistinct(s, k)-atMostKDistinct(s, k-1));
    }
}
