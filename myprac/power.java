package myprac;

public class power {
    static double mypow(double x, int y){
        long n=y;
        // double ans=1.0;
        while(n<0){
            x=1/x;
            n-=n;

        }
        return pow(x,y);
    }
    static double pow(double x, long n){
        if(n==0) return 1.0;
        double sign=pow(x, n/2);
        if(n%2==0){
            return  sign*sign;
        }else
        {
            return sign*sign*x;
        }
    }
    public static void main(String[] args) {
        double x=-2.0000;
        int y=10;
        System.out.println(mypow(x, y));
    }
}
