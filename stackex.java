
import java.util.Arrays;


public class stackex {
    public static int[] asteroidCollision(int[] asteroids) {
        int[] ans = new int[asteroids.length];
        int top = 0;
        for (int n : asteroids) {
            if (top == 0) {
                ans[top++] = n;
            } else if (top > 0 && n<0) {
                int c=Math.abs(n);
               while(top>0&&ans[top-1]>0 && ans[top-1]<c){
                top--;
               }
               if(top>0 && ans[top-1]==c){
                top--;
               }
               if(top==0&& ans[top-1]<0){
                ans[top++]=n;
               }
            }
             else {
                ans[top++] = n;
            }
        }
        return Arrays.copyOf(ans, top);
    }

    public static void main(String[] args) {
        int[] ans = {5, 10, -5};
        int[] ss = asteroidCollision(ans);
        System.out.print("[");
        for (int i = 0; i < ss.length; i++) {
            System.out.print(ss[i] + " ");
        }
        System.out.print("]");
    }
}
