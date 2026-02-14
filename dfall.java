

public class dfall {
    static String result(String s){
        int l=0;
        int r=s.length()-1;
        String temp=" ";
        String ans=" ";
        while(l<=r){
            char ch=s.charAt(l);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' '){
                if(!ans.equals(" ")){
                    ans=temp+" "+ans;
                }
                else{
                    ans=temp;
                }
                temp="";
            }
            l++;}
            if(!temp.equals("")){
                if(!ans.equals("")){
                    ans=temp+" "+ ans;
                }
                else {
                    ans=temp;
                }
            }
            return ans;
        }
public static void main(String[] args) {
            String s = "Janaki Ramayya is a good boy ";
            System.out.println(result(s));
        }
}
