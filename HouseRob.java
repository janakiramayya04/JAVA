class HouseRob{
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int n=arr.length;
        int steal=0,skip=0;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=arr[0];
        for(int i=2;i<n+1;i++){
            steal=arr[i-1]+dp[i-2];
            skip=dp[i-1];
            dp[i]=Math.max(steal, skip);
        }
        System.out.println(dp[n]);
    }
}