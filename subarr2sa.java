
import java.util.*;

public class subarr2sa {

    static List<String> subarraytwo(String str) {
        Set<String> set = new HashSet<>();
        // for(int i=0;i<str.length()-1;i++){
        //     String sub=str.substring(i,i+2);
        //     set.add(sub);
        // }
        for (int i = 0; i < str.length() - 1; i++) {
            char frist = str.charAt(i);
            char second = str.charAt(i + 1);
            if (frist != second) {
                String sub = frist + "" + second;
                set.add(sub);
            }
        }
        return new ArrayList<>(set);
    }

    static boolean isequal(char[] arr1, char[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != 2 || arr2.length != 2) {
            return false;
        }
        return arr1[0] == arr2[0] && arr1[1] == arr2[1];
    }

    static char[][] subarrays2d(char[] arr) {
        int n = arr.length;
        char[][] uniq = new char[n][2];
        int qcnt = 0;
        for (int i = 0; i < n - 1; i++) {
            char c1 = arr[i];
            char c2 = arr[i + 1];
            if (c1 != c2) {
                char[] ch = new char[2];
                ch[0] = arr[i];
                ch[1] = arr[i + 1];
                boolean found = false;
                for (char[] uniqArr : uniq) { // enhanced for loop
                    if (isequal(uniqArr, ch)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    uniq[qcnt] = ch;
                    qcnt++;

                }
            }
        }
        char[][] unqarr = new char[qcnt][2];
        System.arraycopy(uniq, 0, unqarr, 0, qcnt);
        return unqarr;
    }

    public static void main(String[] args) {

        String str = "janakiramayya";
        // List<String> list= subarraytwo(str);
        // System.out.println("Subarrays of length 2 are: " + list);
        char[] arr = str.toCharArray();
        char[][] subarrays = subarrays2d(arr);
        System.out.print("[");
        for (int i = 0; i < subarrays.length; i++) {
            System.out.print(subarrays[i][0]);
            System.out.print(subarrays[i][1]);
            if (i < subarrays.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
