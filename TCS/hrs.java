package TCS;


import java.util.Scanner;

public class hrs {
    static int countchars(String s){
        int[] fre=new int[26];
        int max=0;

        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
            max=Math.max(fre[s.charAt(i)-'a'], max);
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        int index=-1;
        int maxrepeat=0;
        String[] words=ss.split(" ");

        for(int i=0;i<words.length;i++){
           int count=countchars(words[i]);
           if(count>maxrepeat){
            maxrepeat=count;
            index=i;
           }
        }
       if(index!=-1){
        System.out.println(words[index]);
       }else{
        System.out.println("no repetition");
       }

        // System.out.println(arr.toString());
    }
}
