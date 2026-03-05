package TCS;

public class stringsum {

    public static int sumOfNumbers(String s) {
        int sum = 0;
        int num = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                sum += num;
                num = 0;
            }
        }

        sum += num; // add last number
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfNumbers("123xyz"));   // 123
        System.out.println(sumOfNumbers("1xyz23"));   // 24
        System.out.println(sumOfNumbers("12abc20yz68")); // 100
    }
}
