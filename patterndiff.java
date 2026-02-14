

public class patterndiff {

    public static void main(String[] args) {
        int n=5;
        // --- normal pyramid 
        // for (int i = 1; i <=n; i++) {
        //     for(int j=1;j<n-i+1;j++){
        //         System.out.print("#");
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print("-");
        //         if(j<i){
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(" ");
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1){
                    System.out.print("#");
                }else{
                    System.out.print("-");
                }
            }
            for(int j=0;j<n-1;j++){
                if(j<i){
                    System.out.print("-");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println(" ");
        }
    }
}