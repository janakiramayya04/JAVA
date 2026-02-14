
import java.util.Scanner;

public class fibnoccci {
    // static int fib(int x){
    //     if(x==0) return 0;
    //     if(x==1) return 1;
        
    //     return fib(x-1) + fib(x-2);
        
    // }
    static void printfibonnciseries(int n){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
        sc.close();
    }
    public static void main(String[] args) {
        int x=5;
        // System.out.println(fib(x));
        printfibonnciseries(x);
    }
}
