package T100tcs;

public class cubesum {
    public static void main(String[] args) {
        int a = 4, b = 9;

        long sumB = (long)b * (b + 1) / 2;
        sumB = sumB * sumB;

        int x = a - 1;
        long sumA = (long)x * (x + 1) / 2;
        sumA = sumA * sumA;

        System.out.println(sumB - sumA);
    }
}
