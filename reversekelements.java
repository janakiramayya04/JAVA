public class reversekelements {
    // public static void reverse(int start,String ss,StringBuilder ans,int end){
    //     for(int i=end;i>=start;i--){
    //         ans.append(ss.charAt(i));
    //     }
    // }
    public static void  swap(char[] a,int start,int end){
        char temp=a[start];
        a[start]=a[end];
        a[end]=temp;
       }
    public static void main(String[] args) {
        String s="janakirama";
        int k=3;
        int n=s.length();
        StringBuilder ss=new StringBuilder();
        // for(int i=0;i<n;i+=k){
        //     reverse(i,s,ss,k,n);
        // }
        // System.out.println(ss.toString());
       char[] ch=s.toCharArray();
       
        for(int i=0;i<n;i+=k){
            int end;
             end=Math.min(n-1,i+k-1);

             int start=i;

             while(start<end){
                swap(ch,start,end);
                end--;
                start++;
             }
            // reverse(i, s, ss, end);
        }
        System.out.println(new String(ch));
        // System.out.println(ss.toString());
    }
}
