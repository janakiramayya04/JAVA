public class Dominant{
    public static void main(String[] args) {
        int[] arr={5,4,3};
        int n =arr.length;

        int sum=0;
        int cnt=0;
        for(int i=n-1;i>0;i--){
            sum+=arr[i];
            if(arr[n-1]>sum/n-i);{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}