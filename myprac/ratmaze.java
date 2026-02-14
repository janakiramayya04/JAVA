package myprac;

import java.util.ArrayList;

public class ratmaze {
    static ArrayList<String> findPath(int[][] maze, int n){
        ArrayList<String> res= new ArrayList<>();
        if (maze[0][0] == 0) return res;
        boolean[][] visited=new boolean[n][n];
        backtrack(0,0,res,new StringBuilder() , maze ,n,visited);
        return res;
    }
    static void backtrack(int i, int j , ArrayList<String> res, StringBuilder path , int[][] maze, int n, boolean[][] visited){
        if(i==n-1 && j==n-1){
            res.add(path.toString());
            return ;
        }
        int[] di={1,0,0,-1};
        int[] dj={0,-1,1,0};
        char[] move={'D','L','R','U'};
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            int ni=i+di[k];
            int nj=j+dj[k];
            if(isSafe(ni,nj,maze,n, visited)){
                path.append(move[k]);
                backtrack(ni, nj, res, path, maze, n, visited);
                path.deleteCharAt(path.length() - 1);
            }
        }
        visited[i][j] = false;
    }
    static boolean isSafe(int i , int j , int[][] maze, int n, boolean[][] visited){
        return (i>=0 && j>=0 && i<n && j<n && maze[i][j] ==1 && !visited[i][j]);
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        ArrayList<String> paths = findPath(maze, 4);
        System.out.println(paths);
    }
}
