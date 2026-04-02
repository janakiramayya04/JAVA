package T100tcs;

import java.util.ArrayList;
import java.util.Scanner;


// import java.io.*;
// import java.io.IOException;
public class inputstest {
//  public static void main(String[] args) throws  IOException{
//     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//     String ss=br.readLine();
//     int n=Integer.parseInt(br.readLine());
//     double ddi= Double.parseDouble(br.readLine());

//     System.out.println(ss);
//     System.out.println(n);
//     System.out.println(ddi);


//  }   
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String ss=sc.nextLine();
    String[] nums=ss.split(",");
    ArrayList<Integer> ans=new ArrayList<>();
    for(String s: nums){
        // ans.add(Integer.parseInt(s));
        if (!s.isEmpty()) { 
                ans.add(Integer.valueOf(s)); 
            }
    }
    System.out.println(ans);
}
}
