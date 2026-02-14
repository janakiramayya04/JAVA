public class armstrong {
    static boolean isarmstrong(int n){
        int k = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int last = temp % 10;
            sum += Math.pow(last, k);
            temp = temp / 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n=163;
        if(isarmstrong(n)){
            System.out.println(n + " is an armstrong");
        }else{
            System.out.println(n + " is not an armstrong");
        }
    }
    
}
