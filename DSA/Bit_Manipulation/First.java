package DSA.Bit_Manipulation;

public class First {
    public static void main(String[] args) {
        // int n=43261596;
        int n=4;
        // for(int i=31;i>0;i--){
        //     System.out.print((n>>i)&1);
        // }
        // String ss=Integer.toBinaryString(n);
        // String ss=String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        // System.out.println(ss);
        // StringBuilder sar=new StringBuilder(ss);
        // // sar.append(ss);
        // System.out.println(sar.reverse().toString());
        // int ans=Integer.parseInt(sar.toString(),2);
        // System.out.println(ans);
         int res=0;
        for(int i=0;i<32;i++){
           res=  (res<<1)|n&1;
           n>>>=1;
        }
        System.out.println(res);
        
    }
}
