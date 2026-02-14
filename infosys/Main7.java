package infosys;

import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {

    static boolean dfs(int node, int dest, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        if (node == dest) {
            return true;
        }
        vis[node] = true;

        for (int n : adj.get(node)) {
            if (!vis[n]) {
                if (dfs(n, dest, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int src = sc.nextInt();
        int dest = sc.nextInt();
        boolean[] vis = new boolean[n];
        if (dfs(src, dest, adj, vis)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
