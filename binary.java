public class binary {
    public static String conv2string(int n){
        StringBuilder ss=new StringBuilder();
        while (n>0) {
            if (n%2==1) {
                ss.append("1");
            }
            else{
                ss.append("0");
            }
            n=n/2;
        }
        // System.out.println(ss);
        ss.reverse();
        // System.out.println(ss);
        return ss.toString();
    }
    //time complexity : log2n
    // space complexity : log2n 
    //  the number of steps will be equal to the no remainders  

    static int conv2decimal(String s){
        int n=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if (s.charAt(i) == '1') {
                n+=(1<<(len-1-i));
        }
    }
        return n;
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(conv2string(n));
        String ss="1111";
        System.out.println(conv2decimal(ss));
    }
}
