package myprac;

public class greatcd {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        int x=978 ;
        int y=8979876;
        System.out.println(gcd(x,y));
    }
    
}
