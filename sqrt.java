public class sqrt {
    public static int mySqrt(int x) {
        if(x==0) return 0;
         int low=1;
         int high=x;
         while(low<=high){
            int mid=low+(high-low)/2;
            long sq= (long) mid*mid;
            if(sq==x){
                return mid;
            }else if(sq<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
         }
         return high;
    }
    public static void main(String args[]){
        int x=2147395599;
        int ans= mySqrt(x);
        System.out.println(ans);
    }
}
