package infosys;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();
        // int[] p=new int[n];
        // int[] bonus=new int[n];
        // for(int i=0;i<n;i++){
        //     p[i]=sc.nextInt();
        //     bonus[i]=sc.nextInt();
        // }
        List<int[]> ans = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     ans.add(new int[]{p[i],bonus[i]});
        // }
        for (int i = 0; i < n; i++) {
            ans.add(new int[]{sc.nextInt(), sc.nextInt()});
        }
        int a = 0;
        ans.sort(Comparator.comparingInt(x -> x[0]));

        for (int[] pair : ans) {
            int power = pair[0];
            int b = pair[1];

            if (power > exp) {
                break;
            }
            exp += b;
            a++;
        }
        System.out.println(a);
    }

}
