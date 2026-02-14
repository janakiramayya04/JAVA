
import java.util.Arrays;
import java.util.Scanner;

public class finding_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println(0);
            return ;
        }
        Arrays.sort(arr);
        int maxlen=1, count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]) continue;
            if(arr[i]==arr[i-1]+1) {
                count++;
            }else{
                count=1;
            }
            maxlen=Math.max(maxlen, count);
        }
        System.out.println("maximum length subarray: "+maxlen);
        sc.close();
    }    
}
