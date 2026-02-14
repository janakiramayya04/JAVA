package infosys;
import java.util.*;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] traffic=new int[n];
        for(int i=0;i<n;i++){
            traffic[i]=sc.nextInt();
        }
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && traffic[i]>=traffic[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        System.out.print(traffic[dq.peekFirst()] + " ");
        for(int i=k;i<n;i++){
            if(!dq.isEmpty()&& dq.peekFirst()<=i-k){
                dq.pollFirst();
                            }
            while(!dq.isEmpty() &&traffic[i]>=traffic[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
            System.out.print(traffic[dq.peekFirst()] + " ");
        }
    }
}
