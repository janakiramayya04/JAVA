public class pattrens {
    static void pat(int n){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(i==0|| j==0|| i==n-1|| j==n-1)
                    System.out.print("* ");
                 else System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void hallowrect(){
        int row=4;
        int cols=7;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||j==1||i==row||j==cols){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int N = 4;
        pat(N);
        hallowrect();
    }
}
