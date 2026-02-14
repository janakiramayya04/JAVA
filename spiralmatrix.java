import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,top=0,right=m-1,bottom=n-1;
        while(top<=bottom&& left<=right){
            for(int i=left;i<=right;i++)
                ans.add(matrix[top][i]);
            top++;

            for(int j=top;j<=bottom;j++)
               ans.add(matrix[j][right]);
            right--;

            if(top<=bottom){
            for(int k=right;k>=left;k--)
                ans.add(matrix[bottom][k]);
            bottom--;}
            if(left<=right){
                for(int p=bottom;p>=top;p--){
                    ans.add(matrix[p][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    // int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
    int[][] matrix2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    // List<Integer> ans=spiralOrder(matrix);
    List<Integer> ans2=spiralOrder(matrix2);
    // System.out.println(ans);
    System.out.println(ans2);
    }
}
