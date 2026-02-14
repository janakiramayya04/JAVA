import java.util.Scanner;
public  class ptt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        for (int i = 1; i <=N; i++) {
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++){
                System.out.print("*");
                if(a<i){
                    System.out.print(" ");
                }
            }
             
            for(int j=1;j<=(N-i)*2+1;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++){
                System.out.print("*");
                if(a<i){
                    System.out.print(" ");
                }
            }
        System.out.println(" ");
        }
        

    }
}