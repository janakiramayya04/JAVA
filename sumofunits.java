
import java.util.Scanner;

public class sumofunits {
    public static int quicksum(int n){
        n = Math.abs(n);
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }    
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minsum=Integer.MAX_VALUE;
        int result=arr[0];
        for(int i=0;i<n;i++){
            int sum=quicksum(arr[i]);
            if(sum<minsum || (sum == minsum && arr[i] < result)){
                minsum=sum;
                result=arr[i];
            }
        }
        System.out.println("this is the answer: "+result);
        sc.close();
    }
}
