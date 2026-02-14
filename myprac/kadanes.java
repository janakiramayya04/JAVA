package myprac;

public class kadanes {
    static int maxsum(int[] arr){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            else if(sum<0){
                sum=0;
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        // int[] arr={2, 3, 5, -2, 7, -4};
        int[] arr={-2, -3, -7, -2, -10, -4};
        int ans=maxsum(arr);
        System.out.println("Total sum : "+ans);
    }
}
