public class validpalindrome {
    static boolean validp(String s){
        int i=0;
        int l =s.length()-1;
        while(i<l){
            while(i<l && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while( i<l && !Character.isLetterOrDigit(s.charAt(l))) l--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(l))) return false;
            i++;
            l--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = " A man is sinam a";
        if(validp(s)){
            System.out.println("palindrome ");
        }else{
            System.out.println("not palindrome");
        }
    }
}
