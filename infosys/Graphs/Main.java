package infosys.Graphs;

import java.util.*;

public class Main {

    public static int[] shortestDistances(int n, int[][] edges) {

        // Adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph (undirected)
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new ArrayDeque<>();

        // BFS starting from node 0
        dist[0] = 0;
        q.offer(0);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] edges = new int[m][2];
        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        int[] ans = shortestDistances(n, edges);
        for (int d : ans) {
            System.out.print(d + " ");
        }
    }
}
