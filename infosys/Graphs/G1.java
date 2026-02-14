package infosys.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class G1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        ArrayList<Integer>[] adj=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v= sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);

        }
        sc.close();
    }
}
