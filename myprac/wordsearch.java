package myprac;

public class wordsearch {
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == word.charAt(0)) {
            if (backtrack(i, j, board, word, new StringBuilder().append(board[i][j]), visited)) {
                return true;
            }
        }
    }
}
        return false;
    }
    public static boolean backtrack(int i, int j,char[][] board, String word, StringBuilder ss,boolean[][] visited){
        if (ss.length() == word.length()) return ss.toString().equals(word);
        int[] di={1,0,0,-1};
        int[] dj={0,-1,1,0};
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            int ni=i+di[k];
            int nj=j+dj[k];
            if(isSafe(ni,nj, board,visited)&& board[ni][nj] == word.charAt(ss.length())){
                ss.append(board[ni][nj]);
                if(backtrack(ni,nj,board, word, ss,visited))return true;
                ss.deleteCharAt(ss.length()-1);
            }
        }
        visited[i][j]=false;
        return false;
    }
    public static boolean isSafe(int i , int j , char[][] board, boolean[][] visited){
        return (i>=0 && j>=0 && i<board.length && j<board[0].length && !visited[i][j]);
    }
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        boolean rw=exist(board,word);
        System.out.println(rw);

    }
}
