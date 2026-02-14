
public class reversews {
    static String result(String s){
        int l=0;
        int r=s.length()-1;
        String temp = "";
	String ans = "";
        while(l<=r){
            char ch=s.charAt(l);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch == ' '){
                if(!ans.equals("")){
                    ans=temp+ " "+ ans;

                }
                else{
                    ans=temp;
                }
                temp="";
            }
            l++;
        }
        if (!temp.equals(""))
	{
		if (!ans.equals(""))
		{
			ans = temp + " " + ans;
		}
		else
		{
			ans = temp;
		}
	}
        return ans;
    }
    public static void main(String[] args) {
        String s = "TUF is great for interview preparation";
        // System.out.println("Before reversing words: ");
        // System.out.println(s);
        // Stack<String> st = new Stack<>();
        // String str = "";
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == ' ') {
        //         if (!str.isEmpty()) {
        //             st.push(str);
        //             str = "";
        //         }
        //     } else {
        //         str += s.charAt(i);
        //     }
        // }
        // if (!str.isEmpty()) {
        //     st.push(str); // push the last word
        // }
        // StringBuilder ans = new StringBuilder();
        // while (!st.isEmpty()) {
        //     ans.append(st.pop());
        //     if (!st.isEmpty()) {
        //         ans.append(" ");
        //     }
        // }
        // System.out.println("After reversing words: ");
        // System.out.print(ans.toString());
        System.out.println(result(s));
    }
}
