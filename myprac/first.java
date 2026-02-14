package myprac;

public class first {
    static int factorial(int n){
            if (n==0) return 1;
            return n*factorial(n-1);
        }
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    static void reversestring(char[] s,int i ,int j){
        if(i>=j){
            return;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;

        reversestring(s, i+1, j-1);
    }
    static int sumofdigits(int n){
        if(n==0) return 0;
        return (n%10)+sumofdigits(n/10);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
        System.out.println(fib(n));
        String s="janaki";
        char[] cc=s.toCharArray();
        reversestring(cc, 0, cc.length-1);
        String reversed=new String(cc);
        System.out.println(reversed);
        int sod=121;
        System.out.println(sumofdigits(sod));
    }
}
