package T100tcs;

public class FairSquence {
    static int alternatives(int[] arr){
        int n=arr.length;
        int sum=0; 
        int current_sum=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=0 && current_sum>=0 || current_sum<=0 && arr[i]<0){
                current_sum=Math.max(current_sum, arr[i]);
            }
            else{
                sum+=current_sum;
                current_sum=arr[i];
            }
        }
        sum+=current_sum;
        return sum;
    }
    public static void main(String[] args) {
        int[] arr= {21, 12, 13, -21, -2};
        System.out.println(alternatives(arr));
    }
}
