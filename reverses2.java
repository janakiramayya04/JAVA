public class reverses2 {

    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i =0; i<s.length(); i+=2*k){//
            int end = Math.min(i+k-1, s.length()-1);//tp dont exceed the length of the string
            reverse(ch, i, end);
        }
        return String.valueOf(ch);
    }
    public void reverse(char[] ch, int start, int end){
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        reverses2 obj = new reverses2();
        String s = "abcdefg";
        int k = 2;
        String result = obj.reverseStr(s, k);
        System.out.println(result); // Output: "bacdfeg"
    }
}

