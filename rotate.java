public class rotate {
public static int[][] rotate90(int[][] arr,int n , int m){
    for(int i=0;i<n;i++){
        for(int j=i+1;j<m;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int tt=arr[i][j];
            arr[i][j]=arr[i][n-1-j];
            arr[i][n-1-j]=tt;
        }
    }
    return arr;
}
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        rotate90(arr,n,m);
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}