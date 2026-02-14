
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class leader {
    public static List<Integer> findleader(int[] arr){
        int n=arr.length;
        List<Integer> ll=new ArrayList<>();
        int maxx=arr[n-1];
        ll.add(maxx);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxx){
                maxx=arr[i];
                ll.add(maxx);
            }
        }
        Collections.reverse(ll);
        return ll;
    }
    public static void main(String[] args) {
        int[] arr={16,22,5,6,7};
        List<Integer> list=findleader(arr);
        System.out.print(list+" ");
    }
}
