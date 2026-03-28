package TCS;

public class btod {
    public static void main(String[] args) {
        int ss=1011;
        int ans=0;
        int pow=0;
        while(ss>0){
            int rem=ss%10;
            if(rem==1){
                ans += (1 << pow);
                // ans+=Math.pow(2, pow);
                
            }
            pow++;
            ss=ss/10;
        }
        System.out.println(ans);
    }
}
