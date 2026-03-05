package TCS;

public class postitinsubstri {

    public static int foundPattern(String text, String pattern) {
        int N = text.length();
        int M = pattern.length();

        for (int i = 0; i <= N - M; i++) {

            int j;
            for (j = 0; j < M; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == M) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // define input strings
        String text = "takeuforward";
        String pattern = "forward";
        int foundIdx = foundPattern(text, pattern);
        // print result
        System.out.println("The substring starts from the index: " + foundIdx);
        System.out.println(text.indexOf(pattern));
    }
}
