
import java.util.Scanner;

public class countfreq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // for (int x : arr) {

        //     mpp.put(x, mpp.getOrDefault(x, 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());

        // }
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i])
                continue;

            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);

        }
    }

}
