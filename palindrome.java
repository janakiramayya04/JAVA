public class palindrome {
    static String ispakindrome(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            int last=temp%10;
            rev=rev*10+last;
            temp=temp/10;
        }
        if(n==rev){
            return "yes it is a palindrome";
        }
        else{
            return "no it is not a palindrome";}

    }
    public static void main(String[] args) {
        int n=1221;
        System.out.println(ispakindrome(n));
    }
}
