public class anogramtstring {
    static boolean checkAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'A']++;
        }
        for(int j=0;j<s2.length();j++){
            freq[s2.charAt(j)-'A']--;
        }
        for(int k=0;k<26;k++){
            if(freq[k]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNIk";
        System.out.println(checkAnagrams(Str1, Str2));
    }
}
